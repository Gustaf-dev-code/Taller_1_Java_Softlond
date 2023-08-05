import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class punto33 {

    public static void main(String[] args) {
        /*
         * Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
         * cada elemento en un arreglo.
         */

        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("This is the list of numbers: " + Arrays.toString(nums));
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> dict : frequency.entrySet()) {
            Integer key = dict.getKey();
            Integer value = dict.getValue();
            System.out.println("The frequency of number " + key + " : " + value);

        }

    }

}
