package com.exersices;

import com.exersices.Horstmann.chapter2.Point;
import com.exersices.Horstmann.chapter3.Employee;
import com.exersices.Horstmann.chapter3.Measurable;

import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

    //chapter 1
    //1.1
    //Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
    // Print the reciprocal as a hexadecimal floating-point number.

    public static void toBOH(){
        out.println("Enter int value:");
        Scanner tmp = new Scanner(in);
        int num = tmp.nextInt();
        out.println("Binary:");
        out.println(Integer.toBinaryString(num));
        out.println("Octal:");
        out.println(Integer.toOctalString(num));
        out.println("Hex:");
        out.println(Integer.toHexString(num));
        out.println("Reciprocal Hex:");
        out.println(Double.toHexString((double) 1/num));
    }

    //1.2
    //Write a program that reads an integer angle (which may be positive or
    //negative) and normalizes it to a value between 0 and 359 degrees. Try
    //it first with the % operator, then with floorMod.

    public static double normalize360(int angle) {
        angle = angle % 360;
        if (angle < 0) {
            angle = angle + 360;
        }
        return angle;
    }
    public static int normalizeFloorMod(int angle) {
        return Math.floorMod(angle,360);
    }

    //1.3
    //Using only the conditional operator, write a program that reads three
    //integers and prints the largest. Repeat with Math.max.

    public static int maximum(){
        out.println("Enter int array (3 values):");

        Scanner tmp = new Scanner(in);
        int []nums = new int[3];
        for (int i = 0; i < 3; i++)
            nums[i] = tmp.nextInt();

        out.println("Max value:");

        if(nums[0] > nums[1])
            nums[1] = nums[0];
        if (nums[1] > nums[2] )
            nums[2] = nums[1];
        return nums[2];
    }

    public static int maximumMath(){
        out.println("Enter int array (3 values):");
        Scanner tmp = new Scanner(in);
        int []nums = new int[3];
        for (int i = 0; i < 3; i++)
            nums[i] = tmp.nextInt();
        out.println("Max value:");
        return Math.max(Math.max(nums[0],nums[1]), nums[2]);
    }

    //1.4
    //Write a program that prints the smallest and largest positive double values.
    //Hint: Look up Math.nextUp in the Java API.

    public static void maxMin(){
        out.println("Enter double value:");

        Scanner tmp = new Scanner(in);
        double num = tmp.nextDouble();

        out.println(nextUp(num));
        out.println(nextDown(num));
    }

    //1.6
    //Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
    //BigInteger. Compute the factorial of 1000.

    public static BigInteger getFactorial(int a) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i < a+1; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    //1.13
    //Write a program that prints a lottery combination, picking six distinct
    //numbers between 1 and 49. To pick six distinct numbers, start with an
    //array list filled with 1...49. Pick a random index and remove the element.
    //Repeat six times. Print the result in sorted order.

    public static void rands(){
        int min = 1;
        int max = 49;

        List<Integer> nums = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        for(int i = 1; i <= 49; i++)
            nums.add(i);

        for(int i = 1; i <= 6; i++){
            int ex = (int)(random()*((max-min)+1))+min;
            result.add(nums.get(ex));
            nums.remove(ex);
        }
        Collections.sort(result);
        out.println(result);

    }

    public static void main(String[] args) {
        //chapter 1

	    // 1.1
        //toBOH();

        //1.2
        //System.out.println(normalize360(-500));
        //System.out.println(normalizeFloorMod(-500));

        //1.3
        //System.out.println(maximum());
        //System.out.println(maximumMath());

        //1.4
        //maxMin();

        //1.6
        //System.out.println(getFactorial(1000));

        //1.13
        //rands();

        //chapter 2

        //2.5
        //Point point = new Point(3,4).translate(1,3).scale(0.5);
        //System.out.println(point);

        //chapter 3

        //3.1 and 3.2
        /*Employee[] employes = {
                new Employee("Liza", 2000.9f),
                new Employee("Mary", 3400.6f),
                new Employee("Alina", 5600.3f),
        };
        System.out.println(Measurable.average(employes));
        Employee emp = (Employee) Measurable.largest(employes);
        System.out.println(emp.getName());*/

    }
}
