import java.util.Scanner;

public class punto22 {
    public static void main(String[] args) {
        /*
         * 22.Escribe un programa que solicite al usuario una frase y verifique si es un
         * palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String phrase = sc.nextLine();
        phrase = phrase.replaceAll("\\s+", "");
        if (isPalindrome(phrase)) {
            System.out.println("Your sentence is a palindrome!");
        } else {
            System.out.println("Your sentence is not a palindrome!");
        }
        sc.close();
    }

    public static boolean isPalindrome(String text) {
        int txt = text.length();
        StringBuilder chainReverse = new StringBuilder();
        for (int i = txt - 1; i >= 0; i--) {
            chainReverse.append(text.charAt(i));
        }
        System.out.println(text);
        System.out.println(chainReverse.toString());
        return chainReverse.toString().equals(text);
    }

}
