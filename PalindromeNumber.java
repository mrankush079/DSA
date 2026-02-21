import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();

        // int n = 121 ;
        int org = n ;
        int rev = 0 ;

        while(n !=0 ){
            int digit = n %10;
            rev = rev * 10 + digit ;
            n = n / 10;
        }
        if (rev == org){
            System.out.println("palindrome number ");
        }else {
            System.out.println("not palindrome nnumber ");
        }

    }
}
