import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        double oneusd = 0.012; 

   
        System.out.print("Enter amount in indian rupees: ");
        double rupees= sc.nextDouble();

        double convert = rupees * oneusd;

      
        System.out.printf("%.2f rupees is approximately %.2f US dollars", rupees, convert);

        sc.close();
    }
}
