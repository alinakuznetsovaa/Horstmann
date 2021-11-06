package com.exersices;
import Horstmann.chapter3.Employee;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

    //chapter 1
    //1.1
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
    public static int maximum(){
        out.println("Enter int array (3 values):");

        Scanner tmp = new Scanner(in);
        int []nums = new int[3];
        for (int i=0; i< 3;i++)
            nums[i] = tmp.nextInt();

        if(nums[0] > nums[1])
            nums[1] = nums[0];
        if (nums[1] > nums[2] )
            nums[2]=nums[1];
        return nums[2];


    }

    public static int maximumMath(){
        out.println("Enter int array (3 values):");
        Scanner tmp = new Scanner(in);
        int []nums = new int[3];
        for (int i=0; i< 3;i++)
            nums[i] = tmp.nextInt();
        return Math.max(Math.max(nums[0],nums[1]), nums[2]);

    }
    //1.4

    public static void maxMin(){
        out.println("Enter double value:");

        Scanner tmp = new Scanner(in);
        double num = tmp.nextDouble();

        out.println(nextUp(num));
        out.println(nextDown(num));


    }
    //1.6
    public static BigInteger getFactorial(int a) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i < a+1; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    //1.13
    public static void rands(){
        int min = 1;
        int max = 49;

        int []nums = new int[49];

        for (int i=0; i< 49;i++)
            nums[i] =i+1 ;

        int []ex = new int[6];

        for(int i=0;i<6;i++)
            ex[i] = nums[new Random().nextInt(max - min) + min];

        Arrays.sort(ex);

        for(int i=0;i<6;i++)
            out.println(ex[i]);


    }

    public static void main(String[] args) {
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
        System.out.println(Employee.average(employes));
        Employee emp = (Employee) Employee.largest(employes);
        System.out.println(emp.getName());*/







    }
}
