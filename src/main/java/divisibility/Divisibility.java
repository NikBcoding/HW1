package divisibility;


//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.
//
// For example, one run of the program may look like this:
//
//Enter the dividend: 10
//Enter the divisor: 5
//10 is divisible by 5!
//
//Because 5 goes into 10 twice. 10 is evenly divisible by 5.


//Your program should be able to produce the following output:
//
//Enter the dividend: 10
//Enter the divisor: 0
//10 is not divisible by 0




import java.util.Scanner;


public class Divisibility {


    public static void main(String[] args) {


        System.out.println("Enter the divident:");
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();


        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();


        sc.close();
        if(divisor == 0) {
            System.out.println(divident + " is not divisible by " + divisor);
        }


        int result = divident % divisor;


        if (result == 0) {
            System.out.println(divident + " is divisible by " + divisor + "!");
        } else {
            System.out.println(divident + " is not divisible by " + divisor);
        }
    }
}
