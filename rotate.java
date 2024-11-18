import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the position from the last to rotate the array:");
        int k = sc.nextInt();
        k = k % n;
        int temp[] = new int[n];

        for ( i = 0; i < k; i++) {
            temp[i] = arr[n+ i - k ];
        }

        for ( i = 0; i < n - k; i++) {
            temp[k + i] = arr[i];
        }

        System.out.println("Array after rotating from " + k + " positions:");
        for ( i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }

}
