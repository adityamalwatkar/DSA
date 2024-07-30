import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the input value ");
        int iVal = sobj.nextInt();
        boolean resp = isPalindrome(iVal);
        if(resp) {
            System.out.println("The number is a Palindrome number");
        } else {
            System.out.println("The number is not a Palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
