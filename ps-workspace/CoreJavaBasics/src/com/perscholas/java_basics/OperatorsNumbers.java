package com.perscholas.java_basics;

import java.util.Scanner;

public class OperatorsNumbers {
    public static void main(String[] args) {
        part1(1);
        part1(8);
        part1(33);
        part1(78);
        part1(787);
        part1(33987);

        part2();

        part3(9);
        part3(17);
        part3(88);

        part4(150);
        part4(225);
        part4(1555);
        part4(32456);

        part5();

        part6();

        part7();

        part8();
    }


    private static void part1(int n) {
        String result = "";
        while (n > 0) {
            result = n % 2 + result;
            n = n / 2;
        }
        System.out.println(result);
    }

    // 0010
    // 1001
    // 0011 0100
    // 0111 0010
    // 0010 0001 1111
    // 0010 1100 0110 0111
    private static void part2() {
        System.out.println("\n0010 -> 2");
        System.out.println("1001 -> 5");
        System.out.println("0011 0100 -> 52");
        System.out.println("0111 0010 -> 114");
        System.out.println("0010 0001 1111 -> 543");
        System.out.println("0010 1100 0110 0111 -> 11367\n");
    }

    private static void part3(int n) {
        int x = n;
        System.out.println(Integer.toBinaryString(x));

        x <<= 2;
        System.out.println(x + " " + Integer.toBinaryString(x) + "\n");
    }

    private static void part4(int n) {
        int x = n;
        System.out.println(Integer.toBinaryString(x));
        x >>= 2;
        System.out.println(x + " " + Integer.toBinaryString(x) + "\n");
    }

    private static void part5() {
        int x = 7, y = 17, z;
        z = x & y;

        System.out.println(z + " " + Integer.toBinaryString(x) + "\n");
    }

    private static void part6() {
        int x = 5;
        System.out.println(x++);
        System.out.println(x + "\n");
    }

    private static void part7() {
        int x = 0;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x += 1;
        System.out.println(x + "\n");
    }

    private static void part8() {
        int x = 5, y = 8;
        int sum = ++x + y;
        System.out.println(sum);

        x = 5;
        y = 8;
        sum = x++ + y;
        System.out.println(sum);
    }



}
