import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number to check if its a perfect number ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum =0;
        for(int i =1; i<= input /2 ; i++){
            if(input % i == 0) {
                sum = sum+ i ;
            }
        }
        System.out.println(sum);
        if(sum == input){
            System.out.println("Entered number is perfect number");
        } else{
            System.out.println("Entered number is not a perfect number");
        }
    }
}
