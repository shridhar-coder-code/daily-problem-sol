import java.util.Scanner;

public class repeated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = in.nextInt();
        System.out.println("enter the array elements:");
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] count = new int[n];

        for (i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        for(i=0;i<=n;i++){
        if (count[i] >= 1) {
            System.out.println("the number " + i + " is repeated " + count[i] + " times.");
        }
       
    }
    in.close();
}
}
    

