import java.util.Scanner;

public class sumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        // int n = 83756826;
        int sum = 0 ; 

        while ( n !=0){
            int digit = n % 10 ; 
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("sum :"+sum);
    }
}