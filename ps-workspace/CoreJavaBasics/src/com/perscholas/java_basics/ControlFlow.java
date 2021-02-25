package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        part1();

        part2();

        part3();

        part4();

        part5();

        part6();
    }

    private static void part1() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
    }

    private static void part2() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    private static void part3() {
        int x = 50;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }

    private static void part4() {
        int x = 15;

        if (x >= 10 && x <= 20) {
            System.out.println("In range");
        } else {
            System.out.println("out of range");
        }
    }

    private static void part5() {
        Scanner scn = new Scanner(System.in);
        int grade = scn.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println('A');
        } else if (grade >= 80 && grade <= 89) {
            System.out.println('B');
        } else if (grade >= 70 && grade <= 79) {
            System.out.println('C');
        } else if (grade >= 60 && grade <= 69) {
            System.out.println('D');
        } else if (grade >= 59) {
            System.out.println('F');
        } else {
            System.out.println("Score out of range.");
        }

        scn.close();
    }

    private static void part6() {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        switch (num) {
            case 1:
                System.out.println("MONDAY");
            case 2:
                System.out.println("TUESDAY");
            case 3:
                System.out.println("WEDNESDAY");
            case 4:
                System.out.println("THURSDAY");
            case 5:
                System.out.println("FRIDAY");
            case 6:
                System.out.println("SATURDAY");
            case 7:
                System.out.println("SUNDAY");
            default:
                System.out.println("Out of range");
        }
        scn.close();

    }


}
