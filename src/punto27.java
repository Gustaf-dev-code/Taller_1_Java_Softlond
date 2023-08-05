import java.util.Arrays;
import java.util.Scanner;

public class punto27 {
    public static void main(String[] args) {
        /*
         * 27.Crea un programa que solicite al usuario una frase y luego muestre las
         * palabras ordenadas alfabéticamente
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        Arrays.sort(words);
        System.out.println("Your sentence in alphabetical order is: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        sc.close();

    }

}
