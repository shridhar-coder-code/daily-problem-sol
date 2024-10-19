import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0f;

        System.out.println("Enter numbers to add and type 'x' to finish.");

        while (true) {
            String input = sc.nextLine();

          
            if (input.equals("x")) {
                break;
            }

            try {
                
                float number = Float.parseFloat(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to finish.");
            }
        }

        System.out.println("The sum of all entered numbers is: " + sum);
        sc.close(); 
    }
}
