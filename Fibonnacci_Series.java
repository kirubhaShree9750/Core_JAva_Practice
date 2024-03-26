import java.util.Scanner;

public class Fibonnacci_Series {
    public static void main(String[] args) {
        System.out.println("Enter the count of fibonnaci series to be printed ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(0+"\t"+1);
        int fib = 0;
        int fib1 =0;
        int fib2 = 1;
        for(int i=2; i< count; i++){
            fib= fib1+ fib2;
            System.out.print("\t"+fib);
            fib1 = fib2;
            fib2 = fib;

        }
    }
}
