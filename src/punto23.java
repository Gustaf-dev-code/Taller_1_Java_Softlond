import java.util.Scanner;

public class punto23 {
    public static void main(String[] args) {
        /*
         * 23.Crea un programa que pida al usuario una oración y muestre cuántas
         * palabras contiene
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.printf("Your sentence contains %s words.", words.length);
        sc.close();

    }

}
