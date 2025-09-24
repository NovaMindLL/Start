package Stepik_Tutorial;

public class Main5151 {
    public static void main(String[] args) {
        int n = 1034; // пример входного числа
        String s = String.valueOf(n);
        boolean result = false;

        // Перебираем все возможные позиции разделения
        for (int i = 1; i < s.length(); i++) {
            int sumLeft = 0;
            int sumRight = 0;

            // Суммируем цифры слева от разделения
            for (int j = 0; j < i; j++) {
                sumLeft += s.charAt(j) - '0';
            }
            // Суммируем цифры справа от разделения
            for (int j = i; j < s.length(); j++) {
                sumRight += s.charAt(j) - '0';
            }

            // Сравниваем суммы
            if (sumLeft == sumRight) {
                result = true;
                break; // брейк-пойнт найден, можно прервать цикл
            }
        }

        System.out.println("Наличие брейк-пойнта: " + result);
    }
}
