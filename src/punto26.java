import java.util.Scanner;

public class punto26 {
    public static void main(String[] args) {
        /*
         * 26.Escribe un programa que pida al usuario una cadena y muestre cuántos
         * caracteres tiene sin contar los espacios en blanco
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.replaceAll("\\s+", "");
        System.out.println(sentence.length());
        sc.close();

    }

}
