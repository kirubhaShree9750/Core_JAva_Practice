import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        int digits = (input+"").length();
        int val = input;
        while(val > 0){
            int rem = (val % 10);
            sum = sum + Integer.parseInt(String.valueOf(Math.pow(rem, digits)));

            val = val / 10;
        }
       // System.out.println("sum  "+sum);
        if(sum == input){
            System.out.println("Provided number is armstrong");
        } else{
            System.out.println("Provided number is not an armstrong");
        }
    }
}
