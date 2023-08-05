import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sol {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        int valor = lonelyinteger(a);
        System.out.println(valor);
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Set<Integer> arrayHash = new HashSet<>();
        for (int num : a) {
            if (!arrayHash.contains(num)) {
                arrayHash.add(num);
            } else {
                arrayHash.remove(num);
            }
        }

        return arrayHash.iterator().next();

    }

}
