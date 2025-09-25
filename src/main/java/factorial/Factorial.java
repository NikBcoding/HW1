package factorial;
/*
Write a program that prints a factorial to the screen.


The factorial of a number is found by multiplying itself by all positive integers less than it (excluding 0). For example, 4 factorial, written as 4!, can be computed as follows:


4! == 4 * 3 * 2 * 1 == 24
After taking user input for the factorial they want to find, print out the factorial to the console.
Remember to use a for loop! Java does not have a built in factorial operator.
Example Output:
What number would you like to compute the factorial for? 4
24
*/


import java.util.Scanner;


public class Factorial {


    public static void main(String[] args) {
        int start = 1; //initial start will start at 1
        Scanner scanner = new Scanner(System.in);


        System.out.print("What number would you like to compute the factorial for? ");
        int num = scanner.nextInt(); //get user input to compute factorial


        for (int i = 1; i <= num; i++) { //for loop that start at 1 and multiplies up to users input.
            start *= i;  //start multiplies and is oversaved by new outcome.
        }
        System.out.println(start);  //prints out the factorial solution.
    }
}
