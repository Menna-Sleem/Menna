public class Main {
    public static void main(String[] args) {
        int originalArray[] = {1, 2, 3, 4, 5};
        int copiedArray[] = new int[originalArray.length];
                System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
                 System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied Array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}
