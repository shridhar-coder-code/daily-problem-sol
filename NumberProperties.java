import java.util.Scanner;

public class NumberProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Number: " + num);
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Armstrong: " + isArmstrong(num));
        System.out.println("Is Automorphic: " + isAutomorphic(num));

        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0, original = num;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == num;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int digits = countDigits(number);
        int lastDigits = square % (int) Math.pow(10, digits);
        return lastDigits == number;
    }
}
