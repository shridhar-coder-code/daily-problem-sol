import java.util.Scanner;
class Main
{
    
    public static int binarySearch(int[] nums, int target)
    {
       
        int left = 0, right = nums.length - 1;
 
       
        while (left <= right)
        {
            
 
            int mid = (left + right) / 2;
 
          
            
            if (target == nums[mid]) {
                return mid;
            }
 
            else if (target < nums[mid]) {
                right = mid - 1;
            }
 
            else {
                left = mid + 1;
            }
        }
 
       
        return -1;
    }
 
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
       
       
        System.out.println("print the array size:");
        int n = s.nextInt();
      
        int []arr = new int[n];
        System.out.println("enter the array elements:");
        for(int j=0;j<n;j++){
            arr[j]=s.nextInt();
        }
        System.out.println("enter the element to searched:");
        int i= s.nextInt();
        

      
 
        int index = binarySearch(arr, i);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    
 
    
}
}

