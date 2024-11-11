import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size:");
        int n =sc.nextInt();

        System.out.println("enter the array elements:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    
            }
        System.out.println("array without reverse order:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
    
            }
            System.out.println("array with reverse order:");
           
                for (int i = n-1; i>=0; i--) { 
                    System.out.println(arr[i]);
               
            }
            
    }
    
}
