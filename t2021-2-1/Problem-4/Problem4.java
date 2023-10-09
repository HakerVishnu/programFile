import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

       
        Map<Integer, Integer> multiplesCounts = new HashMap<>();

        
        for (int i = 1; i <= 9; i++) {
            multiplesCounts.put(i, 0);
        }

        
        for (int num : inputArray) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesCounts.put(i, multiplesCounts.get(i) + 1);
                }
            }
        }

        System.out.println(multiplesCounts);
    }
}
