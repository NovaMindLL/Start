package TgBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.CopyMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bot extends TelegramLongPollingBot {
    private final String[] questions = {
            "1. Часто ли Вы забываете недавние события или разговоры?",
            "2. Испытываете ли трудности с запоминанием новых маршрутов?",
            "3. Теряетесь ли Вы в привычных и знакомых местах?",
            "4. Бывают ли у Вас внезапные приступы паники или тревоги без явной причины?",
            "5. Испытываете ли Вы проблемы с концентрацией внимания?",
            "6. Появились ли у Вас судороги или непроизвольные движения?",
            "7. Есть ли у Вас нарушения сна, бессоница?",
            "8. Бывает ли у Вас сильная головная боль, которая не проходит после приёма обычных обезболивающих?",
            "9. Чувствуете ли Вы головокружение без видимых причин?",
            "10. Замечаете ли ухудшение способностей к интеллектуальному мышлению?"
    };
    private final String[] orientQuestions = {
            "1. Испытываете ли вы трудности с ориентированием даже в знакомых местах?",
            "2. Часто ли вы теряетесь или чувствуете себя растерянным, даже находясь недалеко от дома?",
            "3. Испытываете ли вы тревогу, панику или беспокойство при попытке найти нужный путь?",
            "4. Трудно ли вам запоминать маршруты и расположение объектов в пространстве?",
            "5. Легко ли вы пользуетесь картой или навигатором, или это вызывает у вас затруднения?",
            "6. Наблюдаете ли вы снижение уверенности в своих способностях ориентироваться в пространстве по сравнению с прошлым?",
            "7. Есть ли у вас сложности с представлением маршрута или его последовательности?",
            "8. Испытываете ли вы страх выйти на прогулку или в поездку в одиночку из-за боязни потеряться?",
            "9. Чувствуете ли вы скованность или нервозность при необходимости ориентироваться в пространстве?",
            "10. Как часто вы замечаете, что приходите не в то место или сбиваетесь с пути?"
    };
    private final Map<Long, Integer> currentQuestion = new HashMap<>();
    private final Map<Long, Integer> score = new HashMap<>();

    private final Map<Long, Integer> orientCurrentQuestion = new HashMap<>();
    private final Map<Long, Integer> orientScore = new HashMap<>();

    private final Map<Long, Integer> savedCheckScores = new HashMap<>();
    private final Map<Long, Integer> savedOrientScores = new HashMap<>();

    @Override
    public String getBotUsername() {
        return "BotTut";
    }

    @Override
    public String getBotToken() {
        return "";
    }

    @Override
    public void onUpdateReceived(Update update) {
        try {
            if (update.hasCallbackQuery()) {
                if (update.getCallbackQuery().getMessage() != null &&
                        update.getCallbackQuery().getMessage().getChatId() != null) {

                    Long chatId = update.getCallbackQuery().getMessage().getChatId();
                    String data = update.getCallbackQuery().getData();

                    if (orientCurrentQuestion.containsKey(chatId)) {
                        handleOrientTestAnswer(chatId, data);
                        return;
                    }

                    if (currentQuestion.containsKey(chatId)) {
                        handleCheckTestAnswer(chatId, data);
                        return;
                    }
                } else {
                    System.err.println("CallbackQuery message или chatId равны null");
                    return;
                }
            } else if (update.hasMessage() && update.getMessage() != null && update.getMessage().hasText()) {
                Long chatId = update.getMessage().getChatId();
                String text = update.getMessage().getText();

                switch (text) {
                    case "/check":
                        currentQuestion.put(chatId, 0);
                        score.put(chatId, 0);
                        sendQuestion(chatId, questions[0]);
                        break;

                    case "/orient_test":
                        orientCurrentQuestion.put(chatId, 0);
                        orientScore.put(chatId, 0);
                        sendQuestion(chatId, orientQuestions[0]);
                        break;

                    case "/tips":
                        sendText(chatId, "1.\tТренировка памяти и пространственной ориентации:\n" +
                                "• Изучение карт и запоминание маршрутов;\n" +
                                "• Внимательное наблюдение за окружающими объектами и ориентирующими знаками;\n" +
                                "• Проговаривание или мысленное повторение пути и ключевых элементов на маршруте.\n" +
                                "2.\tАктивное исследование новых мест:\n" +
                                "• Частые прогулки и поездки в новые незнакомые места;\n" +
                                "• Создание в голове мысленной карты местности.\n" +
                                "3.\tОграничение зависимости от гаджетов: стараться не полагаться исключительно на GPS-навигаторы, чтобы «воспитывать» внутренний навигатор.\n"
                                +
                                "4.\tИспользование вспомогательных средств:\n" +
                                "• Запись маршрутов, ориентиров в блокнот или заметки в телефоне;\n" +
                                "• Скачивание офлайн-карт на случай отсутствия интернета.\n" +
                                "5.\tОбращение за помощью: спрашивать дорогу у местных жителей, уточнять направления.\n"
                                +
                                "6.\tПсихологическая поддержка: при наличии страха или тревоги обращаться к психологу для работы с внутренними установками и стрессом.\n"
                                +
                                "7.\tПостепенное привыкание: регулярная практика и настойчивость помогут улучшить навык ориентации со временем.\n"
                                +
                                "Эти упражнения и рекомендации помогут уменьшить симптомы топографического кретинизма и повысить уверенность в ориентировании на местности:)");
                        break;

                    case "/results":
                        if (savedCheckScores.containsKey(chatId)) {
                            int finalScore = savedCheckScores.get(chatId);
                            String result = finalScore > 4
                                    ? "На основании Ваших ответов выявлены симптомы, которые могут указывать на нарушения работы гиппокампа - части мозга, отвечающей за память и ориентацию в пространстве. Это может свидетельствовать о таких заболеваниях, как склероз гиппокампа, начальные стадии болезни Альцгеймера, гиппокампальная амнезия, синдром Корсакова и др. Это очень серьёзные заболевания, поэтому рекомендую обратиться к врачу.\n"
                                            +
                                            "Если Вы положительно ответили на вопросы №2-3, то рекомендую пройти тест на топографический кретинизм, выбрав команду /orient_test.\n"
                                            +
                                            "Прошу обратить внимание, что результаты тестирования не являются диагнозом. Советую обратиться к специалисту.\n"
                                    : "Поздравляю! Исходя из Ваших ответов, я не выявил симптомов заболеваний, связанных с гиппокампом. Однако предлагаю Вам соблюдать меры профилактики, чтобы минимизировать вероятность развития этих заболеваний в дальнейшем.";
                            sendText(chatId, "Результаты теста на гиппокамп:\nБаллы: " + finalScore + "\n" + result);
                        } else if (savedOrientScores.containsKey(chatId)) {
                            int finalScore = savedOrientScores.get(chatId);
                            String resultMessage;
                            if (finalScore >= 3) {
                                resultMessage = "На основании Ваших ответов я сделал вывод, что у Вас есть географический кретинизм. "
                                        +
                                        "Он не считается официальным медицинским диагнозом, а скорее отражает выраженные трудности с ориентированием в пространстве, сопровождающиеся тревожностью и паникой. "
                                        +
                                        "Поэтому обращаться к врачу Вам не обязательно, но Вы можете воспользоваться моими рекомендациями для улучшения состояния. Выберите команду /tips.";
                            } else {
                                resultMessage = "Поздравляю! Исходя из Ваших ответов, я не выявил у Вас географический кретинизм, "
                                        +
                                        "однако предлагаю Вам ознакомиться с моими рекомендациями, чтобы исключить вероятность этого заболевания в дальнейшем. Выберите команду /tips.";
                            }
                            sendText(chatId, "Результаты теста на топографический кретинизм:\nБаллы: " + finalScore
                                    + "\n" + resultMessage);
                        } else {
                            sendText(chatId,
                                    "Вы еще не проходили ни один тест. Напишите /check или /orient_test чтобы начать.");
                        }
                        break;

                    case "/cancel":
                        currentQuestion.remove(chatId);
                        score.remove(chatId);
                        orientCurrentQuestion.remove(chatId);
                        orientScore.remove(chatId);
                        sendText(chatId, "Текущая операция отменена");
                        break;

                    default:
                        sendText(chatId, "Здравствуйте! Если вы хотите: \n" +
                                "• пройти тестирование для выявления предрасположенности заболеваниям - нажмите /check;\n"
                                +
                                "• пройти тестирование на топографический кретинизм - /orient_test;\n" +
                                "• узнать результаты теста (если уже проходил) - /results;\n" +
                                "• получить рекомендации по улучшению состояния (в случае положительного теста на топографический кретинизм) - /tips;\n"
                                +
                                "• отменить текущую операцию или выйти из теста - /cancel. Готовы начать? Просто выберите соответствующую команду:)");
                        break;
                }
            } else {
                System.err.println("Update не содержит сообщения с текстом и callbackQuery");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleCheckTestAnswer(Long chatId, String data) {
        int questionIndex = currentQuestion.getOrDefault(chatId, 0);
        if ("yes".equals(data)) {
            score.put(chatId, score.getOrDefault(chatId, 0) + 1);
        }
        questionIndex++;

        if (questionIndex < questions.length) {
            currentQuestion.put(chatId, questionIndex);
            sendQuestion(chatId, questions[questionIndex]);
        } else {
            int finalScore = score.getOrDefault(chatId, 0);
            savedCheckScores.put(chatId, finalScore); // сохраняем результат

            String result = finalScore > 4
                    ? "На основании Ваших ответов выявлены симптомы, которые могут указывать на нарушения работы гиппокампа - части мозга, отвечающей за память и ориентацию в пространстве. Это может свидетельствовать о таких заболеваниях, как склероз гиппокампа, начальные стадии болезни Альцгеймера, гиппокампальная амнезия, синдром Корсакова и др. Это очень серьёзные заболевания, поэтому рекомендую обратиться к врачу.\n"
                            +
                            "Если Вы положительно ответили на вопросы №2-3, то рекомендую пройти тест на топографический кретинизм, выбрав команду /orient_test.\n"
                            +
                            "Прошу обратить внимание, что результаты тестирования не являются диагнозом. Советую обратиться к специалисту.\n"
                    : "Поздравляю! Исходя из Ваших ответов, я не выявил симптомов заболеваний, связанных с гиппокампом. Однако предлагаю Вам соблюдать меры профилактики, чтобы минимизировать вероятность развития этих заболеваний в дальнейшем.";
            sendText(chatId, "Итог: " + finalScore + ". " + result);

            currentQuestion.remove(chatId);
            score.remove(chatId);
        }
    }

    private void handleOrientTestAnswer(Long chatId, String data) {
        int questionIndex = orientCurrentQuestion.getOrDefault(chatId, 0);
        if ("yes".equals(data)) {
            orientScore.put(chatId, orientScore.getOrDefault(chatId, 0) + 1);
        }
        questionIndex++;

        if (questionIndex < orientQuestions.length) {
            orientCurrentQuestion.put(chatId, questionIndex);
            sendQuestion(chatId, orientQuestions[questionIndex]);
        } else {
            int finalScore = orientScore.getOrDefault(chatId, 0);
            savedOrientScores.put(chatId, finalScore); // сохраняем результат

            String resultMessage;
            if (finalScore >= 3) {
                resultMessage = "На основании Ваших ответов я сделал вывод, что у Вас есть географический кретинизм. " +
                        "Он не считается официальным медицинским диагнозом, а скорее отражает выраженные трудности с ориентированием в пространстве, сопровождающиеся тревожностью и паникой. "
                        +
                        "Поэтому обращаться к врачу Вам не обязательно, но Вы можете воспользоваться моими рекомендациями для улучшения состояния. Выберите команду /tips.";
            } else {
                resultMessage = "Поздравляю! Исходя из Ваших ответов, я не выявил у Вас географический кретинизм, " +
                        "однако предлагаю Вам ознакомиться с моими рекомендациями, чтобы исключить вероятность этого заболевания в дальнейшем. Выберите команду /tips.";
            }
            sendText(chatId, resultMessage);
            orientCurrentQuestion.remove(chatId);
            orientScore.remove(chatId);
        }
    }

    private void sendQuestion(Long chatId, String question) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId.toString());
        message.setText(question);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        rowInline.add(InlineKeyboardButton.builder().text("Да").callbackData("yes").build());
        rowInline.add(InlineKeyboardButton.builder().text("Нет").callbackData("no").build());

        rowsInline.add(rowInline);
        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendText(Long chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId.toString());
        message.setText(text);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
