import java.util.Scanner;

public class punto11 {
    public static void main(String[] args) {
        /*
         * 11. Escribe un programa que calcule el área de un triángulo utilizando la
         * fórmula
         * de Herón. El usuario debe ingresar las longitudes de los tres lados.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: " + area);
        sc.close();
    }

}
