// import java.util.Scanner;

// public class PalindromeNumber {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The Number ");
//         int n = sc.nextInt();
        

//         // int n = 121 ;
//         int org = n ;
//         int rev = 0 ;

//         while(n !=0 ){
//             int digit = n %10;
//             rev = rev * 10 + digit ;
//             n = n / 10;
//         }
//         if (rev == org){
//             System.out.println("palindrome number ");
//         }else {
//             System.out.println("not palindrome nnumber ");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class PalindromeNumber {

//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//         int org = n;
//         int rev = 0;
         
//         while ( n != 0 ){
//             int digit = n % 10 ; 
//             rev = rev * 10 + digit;
//             n = n/ 10 ; 
//         }
//         if  (rev == org ) {
//             System.out.println(" is palindrome number ");

//         } else 
//         {
//             System.out.println(" is not palindrome number ");
//         }
//         sc.close();

//     }
// }

import java.util.Scanner;

public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();

        int org = n ;
        int rev = 0 ; 

        while (n !=0 ){
            int digit = n % 10 ; 
            rev = rev * 10 +  digit ; 
            n = n / 10 ; 
        }
        if ( rev == org ) {
            System.out.println("Number is palindrome ");
        }
        else{
            System.out.println(" number is not Palindrome ");
        }
        sc.close();
    }
}