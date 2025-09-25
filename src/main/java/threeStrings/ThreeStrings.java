package threeStrings;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!


import java.util.Scanner;


public class ThreeStrings {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();  //save user's first input as first
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();  //save user's second input as second
        System.out.print("Enter the third string: ");
        String third = scanner.nextLine();  //save user's third input as third


        String contacString = first+second;  //concatenate first and second user inputs


        if(contacString.equals(third)){  //checks if the concatenated string is equal to the third string
            System.out.println(first + " + " +  second + " is equal to " + third);  //if true, out puts this
        }else {
            System.out.println(first + " + " +  second + " is not equal to " + third);  //if false outputs this
        }
    }
}
