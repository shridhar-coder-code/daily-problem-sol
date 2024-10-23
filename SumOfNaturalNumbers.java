import java.util.Scanner;

public class SumOfNaturalNumbers {

  
    public static int sum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (n) to calculate the sum of the first n natural numbers: ");
        int n = sc.nextInt();

        int sum = sum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
