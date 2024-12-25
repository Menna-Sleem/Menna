
public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        
        int numberToFind = 30;
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The number " + numberToFind + " exists in the array.");
        } else {
            System.out.println("The number " + numberToFind + " does not exist in the array.");
        }
    }
}

            
