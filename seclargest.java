
public class Main {
    public static void main(String[] args) {
        // Set the array
        int arr[] = {10, 20, 25, 30, 5, 40};

        // Ensure that the array has more than 2 elements
        if (arr.length < 2) {
            System.out.println("Should have more than 2 elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second largest numbers
        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        // Print the results
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
