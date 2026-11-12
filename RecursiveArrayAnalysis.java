/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursive.array.analysis;

/**
 *
 * @author Zhel
 */
public class RecursiveArrayAnalysis {

 // Problem 3
    public static int arraySum(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }
        return values[index] + arraySum(values, index + 1);
    }

    public static int findMaximum(int[] values, int index) {
        if (index == values.length - 1) {
            return values[index];
        }
        int maxOfRest = findMaximum(values, index + 1);
        return (values[index] > maxOfRest) ? values[index] : maxOfRest;
    }

    public static int countEven(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }
        int isEven = (values[index] % 2 == 0) ? 1 : 0;
        return isEven + countEven(values, index + 1);
    }


    public static void main(String[] args) {
        int[] values = {12, 7, 4, 19, 6, 10};

        System.out.println(arraySum(values, 0));

        if (values != null && values.length > 0) {
            System.out.println(findMaximum(values, 0));
        } else {
        }

        System.out.println(countEven(values, 0));
    }
    //close code, all done
}