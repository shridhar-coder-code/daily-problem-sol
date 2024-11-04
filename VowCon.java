import java.util.Scanner;

public class VowCon {
    public static void main(String[] args) {
        String x;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a word: ");
        x = in.nextLine();
        
        char[] vowels = new char[x.length()]; 
        char[] consonants = new char[x.length()]; 
        int vi = 0, ci = 0; 

        for (int i = 0; i < x.length(); i++) {
            char input = x.charAt(i);

            
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' ||
                input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
                
                    vowels[vi++] = input; 
            } else if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
                
               consonants[ci++] = input;
            }
        }

       
        System.out.print("Vowels: ");
        for (int i = 0; i < vi; i++) {
            System.out.print(vowels[i] + ",");
        }
        System.out.println("\nNumber of vowels: " + vi);

       
        System.out.print("Consonants: ");
        for (int i = 0; i < ci; i++) {
            System.out.print(consonants[i] + ",");
        }
        System.out.println("\nNumber of consonants: " + ci);

        in.close();
    }
}
