package Palindrome;

public class Main {

    public static boolean isPalindrome(String text) {
        String replace = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(replace).reverse().toString();
        return replace.equals(reversed);

    }

    public static void main(String[] args) {
        String text1 = "Was it a cat I saw?";
        boolean res1 = isPalindrome(text1);
        System.out.println(res1);
        String text2 = "A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.";
        boolean res2 = isPalindrome(text2);
        System.out.println(res2);
    }
}
