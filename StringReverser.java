import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word to reverse it:");
        String input = sc.nextLine();
        String reversed = reverseString(input);

        if (input == null || input.length() <= 1) {
            System.out.println("please enter the valid string");
        } else {
            System.out.println("Input: " + input);
            System.out.println("Output: " + reversed);
        }
        sc.close();
    }

    public static String reverseString(String str) {

        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
