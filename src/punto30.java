import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class punto30 {

    public static void main(String[] args) {
        /*
         * 30. Eliminar duplicados: Diseña un programa que elimine los elementos
         * duplicados de un arreglo.
         */

        List<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(10));
        }
        System.out.println("Original list: " + arr);
        Set<Integer> noduplicSet = new HashSet<>(arr);
        System.out.println("Set without duplicates: " + noduplicSet);

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    j--;
                }
            }

        }
        System.out.println("List without duplicates: " + arr);
    }
}
