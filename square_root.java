import java.util.Scanner;

public class square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repair = false;
        System.out.println("enter the a perfect square root number:");
        int sq = sc.nextInt();
        for (int n = 1; n * n <= sq; n++) {
            if (n * n == sq) {
                System.out.println("it is a perfect square and the square root of it is " + n);
                repair = true;
            }

        }
        if (!repair) {
            System.out.println("it is not a perfect square");
        }

        sc.close();
    }

}
