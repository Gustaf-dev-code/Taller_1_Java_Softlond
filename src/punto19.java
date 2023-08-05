import java.util.Scanner;

public class punto19 {
    public static void main(String[] args) {

        /*
         * 19.Escribe un programa que solicite al usuario su nombre y luego lo imprima
         * en
         * mayúsculas y minúsculas
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        sc.close();
    }

}
