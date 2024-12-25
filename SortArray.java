import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        Arrays.sort(array);

        System.out.println("Sorted Array in Ascending Order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
