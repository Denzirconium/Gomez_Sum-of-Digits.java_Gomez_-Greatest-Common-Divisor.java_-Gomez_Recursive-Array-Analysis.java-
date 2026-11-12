/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.of.digits;

/**
 *
 * @author Zhel
 */
public class SumOfDigits {

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = 1 + 2 + 3 + 4;
        System.out.println(result);
        
    }
    // Sum of digits finishing
}