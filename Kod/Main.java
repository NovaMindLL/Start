package Kod;

public class Main {
    static int cont = 0;

    public static void main(String[] args) {
        String word = "Код";
        String word1 = word.toLowerCase();
        String text = "Код - код - код — и день пролетел, "
                + "Код - код - код — и ночь не заметил, "
                + "Код - код - код — багов стало чуть меньше, "
                + "Код - код - код — и опять всё не так, "
                + "Код - код - код… но без него скучно.";
        String text1 = text.toLowerCase();

        System.out.println("Слово «" + word + "» встречается - " + quantity(word1, text1) + " раз");

    }

    public static int quantity(String word1, String text1) {
        String[] words = text1.split(" |…");
        for (String w : words) {
            if (w.equals(word1)) {
                cont++;
            }
        }
        return cont;
    }

}