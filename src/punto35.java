public class punto35 {
    public static void main(String[] args) {
        /*
         * 35.Tabla de multiplicar: Crea un programa que imprima las tablas de
         * multiplicar del 1 al 10. Usa para esto una matriz
         */

        int[][] tabla = new int[10][10];

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                tabla[i][j] = i * j;
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("Multiplication Table of " + i + "\n");
            for (int j = 1; j < 10; j++) {
                System.out.println("\t" + i + "x" + j + " = " + tabla[j][i] + " ");
            }
            System.out.println();
        }
    }

}
