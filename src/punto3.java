import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) throws Exception {
        /*
         * 3. Crea un programa que calcule y muestre el área y el perímetro de un
         * círculo.
         * El usuario debe proporcionar el radio del círculo
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
        sc.close();
    }

}
