import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reversed = 0;   // variable to store reversed number
        int original = number; // store original number (optional for display)
        
        while (number != 0) {
            int digit = number % 10;    // get last digit
            reversed = reversed * 10 + digit; // append digit
            number = number / 10;       // remove last digit
        }
        
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
        
        sc.close();
    }
}
