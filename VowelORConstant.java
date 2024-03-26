import java.util.Scanner;

public class VowelORConstant {
    public static void main(String[] args) {
        System.out.println("Enter the char to check if its Vowel OR Constant");
        Scanner sc = new Scanner(System.in);
        char input= sc.nextLine().toLowerCase().charAt(0);
        if(input == 'a' || input == 'e' || input == 'i'|| input == 'o'|| input == 'u'){
            System.out.println("Entered input is vowel");
        } else{
            System.out.println("Entered input is constant");
        }
    }
}
