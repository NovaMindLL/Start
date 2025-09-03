package Kod;

public class Main {
    public static void main(String[] args) {

        String word = "Код";
        String text = "Код - код - код — и день пролетел," +

                "Код - код - код — и ночь не заметил," +

                "Код - код - код — багов стало чуть меньше," +

                "Код - код - код — и опять всё не так," +

                "Код - код - код… но без него скучно.";

        System.out.println("Слово «" + word + "» встречается - " + quantity(text, word) + " раз");

    }

    public static int quantity(String text, String word) {

        String[] words = text.split("[\\s\\-—…,“”.;]+");
        int cont = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                cont++;
            }
        }
        return cont;
    }

}