/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatest.common.divisor;

/**
 *
 * @author Zhel
 */
public class GreatestCommonDivisor {
// Problem 2
        public static int gcd(int number1, int number2) {
        if (number1 == 0 || number2 == 0)
            return 0;
        if (number1 == number2)
            return number1;
        if (number1 > number2)
            return gcd(number1 - number2, number2);
        else
            return gcd(number1, number2 - number1);
        // GCD COMPLETE
    }

    public static void main(String[] args) {
        // Problem 2 Greatest Common Divisor (GCD
        int number1 = 48, number2 = 18;
        // numbers in problem 2
        System.out.println(gcd(number1, number2));
    }
    //close code
}