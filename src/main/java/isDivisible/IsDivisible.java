package isDivisible;


//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)


public class IsDivisible {


    //boolean has only a true or false outcomes, we need to see if int b is evenly divisible into int a
    public boolean isDivisible(int a, int b) {
        // if int b is 0, then the answer will always be 0
        // we check if it is 0 right away. If so, we return false and code terminates.
        if (b == 0) {
            return false;
        }
        // If remainder is 0, returns true, if not 0, returns false.
        return a % b == 0;
    }
}
