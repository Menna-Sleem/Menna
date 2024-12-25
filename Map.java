
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 20, 20, 10, 40};
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int key : countMap.keySet()) {
            System.out.println("Number " + key + " occurs " + countMap.get(key) + " times.");
        }
    }
}


            
