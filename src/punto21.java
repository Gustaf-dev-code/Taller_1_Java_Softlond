import java.util.Scanner;

public class punto21 {
    public static void main(String[] args) throws Exception {
        /*
         * 21.Pide al usuario una cadena y muestra cuántas veces aparece una letra
         * específica en ella
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String txt = sc.nextLine();
        System.out.print("Enter the letter: ");
        char letter = sc.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == letter) {
                counter++;
            }
        }
        System.out.printf("The letter you have entered is repeated: %d times", counter);
        sc.close();
    }
}
