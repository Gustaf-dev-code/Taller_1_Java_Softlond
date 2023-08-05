import java.util.Random;

public class punto18 {
    public static void main(String[] args) {
        /*
         * 18.Crea un programa que genere una contraseña aleatoria de 8 caracteres que
         * contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
         * clase Math para generar números aleatorios y la clase String para manipular
         * la contraseña.
         */

        int lenght = 8;
        String password = generatePassword(lenght);
        System.out.printf("The password created is: %s", password);

    }

    public static String generatePassword(int lenght) {

        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            key.append(characters.charAt(random.nextInt(characters.length())));
        }
        return key.toString();
    }

}
