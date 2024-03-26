import java.util.Scanner;

public class Leap_Year_Or_not {
    public static void main(String[] args) {
        System.out.println("Enter the year to check if its leap year or not");
        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();
        if((input % 4 ==0 && input % 100  != 0) || input%400 ==0){
                System.out.println("Entered year is  a leap year");

        } else {
            System.out.println("Entered year is not  a leap year");
        }
    }
}
