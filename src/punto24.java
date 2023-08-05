import java.util.Scanner;

public class punto24 {
    public static void main(String[] args) {
        /*
         * 24.Realiza un programa que solicite al usuario una cadena y reemplace todas
         * las apariciones de una letra específica por otra
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentences: ");
        String sentence = sc.nextLine();
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        System.out.print("Enter a letter to replace the other letter entered: ");
        char newLetter = sc.next().charAt(0);
        String sentenceReplace = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                sentenceReplace = sentence.replace(sentence.charAt(i), newLetter);
            }
        }
        System.out.printf("This is the sentence you entered at the beginning: %s \n", sentence);
        System.out.printf("This is the sentence you have entered with the letter change: %s", sentenceReplace);
        sc.close();

    }

}
