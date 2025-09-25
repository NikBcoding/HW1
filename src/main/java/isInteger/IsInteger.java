package isInteger;


import java.util.Scanner;


public class IsInteger {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();  //save what user typed in as userInput


        if (isInteger(userInput)) {  //calls isInteger method with userInput as the argument.
            System.out.println("The string " + userInput + " is an Integer"); //executes if the method returned true
        } else {
            System.out.println("The string " + userInput + " is not an Integer"); //executes if the method returned false
        }
    }


    public static boolean isInteger(String str) {  //method that is called with userInput as the argument
        for (int i = 0; i < str.length(); i++) {  //iterate each index of the userInput length.
            if (!Character.isDigit(str.charAt(i))) {  //checks to see if the characters of each index is indeed a digit.
                return false; //if at least one character is not a digit.
            }
        }
        return true; // if all characters are digits.
    }
}
//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//
