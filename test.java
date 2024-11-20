import java.util.Scanner;

public class test {
    public static int ok(int[] nums) {
        int max = 0;
        int current = 0;

        for (int n : nums) {
            if (n == 1) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        test o = new test();
        int r = test.ok(arr);
        System.out.println("the number 1 repeated " + r + " times");
        sc.close();
    }
}
