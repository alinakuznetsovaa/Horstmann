package com.exersices;
import Horstmann.chapter3.Employee;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //chapter 1
    //1.1
    public static void toBOH(){
        Scanner tmp = new Scanner(System.in);
        int num = tmp.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
        double dnum = (double) 1/num;
        System.out.println(Double.toHexString(dnum));

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
        Scanner tmp = new Scanner(System.in);
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
        Scanner tmp = new Scanner(System.in);
        int []nums = new int[3];
        for (int i=0; i< 3;i++)
            nums[i] = tmp.nextInt();
        return Math.max(Math.max(nums[0],nums[1]), nums[2]);

    }
    //1.4

    public static void maxMin(){
        Scanner tmp = new Scanner(System.in);
        double num = tmp.nextDouble();

        System.out.println(Math.nextUp(num));

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
            System.out.println(ex[i]);


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

        //1.4 недоделано
        //maxMin();

        //1.6
        //System.out.println(getFactorial(1000));

        //1.13
        //rands();

        //chapter 2

        //2.5
        //Point point = new Point(3,4).translate(1,3).scale(0.5);
        //System.out.println(point);

        //2.9

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
