import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt(); // Reading the number of terms from the user

        // Initializing the first two terms of the Fibonacci series
        int firstTerm = 0, secondTerm = 1;

        // Printing the Fibonacci series up to 'n' terms
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " "); // Printing the current term

            // Calculating the next term in the series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm; // Updating the first term to the next term
            secondTerm = nextTerm;  // Updating the second term to the calculated next term
        }

        scanner.close(); // Closing the Scanner object
    }
}
