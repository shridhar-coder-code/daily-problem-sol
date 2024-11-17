import java.util.Scanner;

public class newprg {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = ok.nextInt();
        System.out.println("enter the array elements:");
        int[] g = new int[n + 1];
        for (int i = 0; i < n; i++) {
            g[i] = ok.nextInt();
        }
        int i;
        System.out.println("array in the unsorted order:");
        for (i = 0; i < n; i++) {
            System.out.println(" "+g[i]);
        }
        for (i = 0; i < n - 1; i++) {
            for (int j = 0; j <n - i - 1; j++) {

                if (g[j] > g[j + 1]) {
                    int temp = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = temp;
                }

            }
        }
        System.out.println("array in the sorted order:");
        for (i = 0; i < n; i++) {
            System.out.print(" "+g[i]);
        }
        ok.close();
    }

}