import java.util.Scanner;

class big {
    public void main(int a, int b, int c) {
        play(a, b, c);
    }

    public void play(int a, int b, int c) {
        int max =0;
        if (a >= b && a >=  c) {
            max = a;
        } else if (b >=  a && b >=  c) {
            max = b;
        } else if (c >=  a && c >=  b) {
            max = c;
        }
        

        int min =0;
        if (a  <=  b && a <=  c) {
            min = a;
        } else if (b <=  a && b <=  c) {
            min = b;
        } else if (c <=  a && c <=  b) {
            min = c;
        }
        System.out.println("maximum value :" +max);
        System.out.println("minimum value :" + min);

    }
}

public class bignumber {
    public static void Main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = in.nextInt();
        System.out.println("enter the second number :");
        int b = in.nextInt();
        System.out.println("enter the third number :");
        int c = in.nextInt();

        big g = new big();
        g.main(a, b, c);
        
        in.close();

    }

}
