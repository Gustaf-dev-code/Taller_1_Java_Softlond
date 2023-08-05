import java.util.Scanner;

public class punto25 {
    public static void main(String[] args) {
        /*
         * 25.Pide al usuario una frase y muestra cada palabra por separado
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yout sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int counter = 1;
        for (String word : words) {
            System.out.println("Word #" + counter + ": " + word);
            counter++;
        }
        sc.close();
    }

}
