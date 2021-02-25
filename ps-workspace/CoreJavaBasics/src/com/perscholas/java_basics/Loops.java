package com.perscholas.java_basics;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
        part6();
        part7();
        part8();
        part9();
    }

    private static void part1() {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
    }

    private static void part2() {
        System.out.println("\n");
        int i = 0;
        while (i <= 100) {
            System.out.print(i + " ");
            i += 10;
        }
    }

    private static void part3() {
        System.out.println("\n");
        int i = 1;
        do {
            System.out.print(i++ + " ");
        } while (i < 11);
    }

    private static void part4() {
        System.out.println("\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i > 25 && i < 75) {
                    continue;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }

    private static void part5() {
        System.out.println("\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                if (i <= 50)
                    System.out.print(i + " ");
                else
                    break;
        }
    }

    private static void part6() {
        System.out.println('\n');
        for (int i = 1; i < 3; i++) {
            System.out.printf("Week %d:%n%n", i);
            for (int j = 1; j < 6; j++) {
                System.out.printf("Day %d%n%n", j);
            }
        }
    }

    private static void part7() {
        for (int i = 10; i < 201; i++) {
            int temp = 0;
            for (int j = i; j > 0; j /= 10)
                temp = temp * 10 + j % 10;

            if (temp == i)
                System.out.print(i + " ");
        }
    }

    private static void part8() {
        System.out.println("\n");
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1);
        do {
            System.out.print(", " + n2);
            int fib = n1 + n2;
            n1 = n2;
            n2 = fib;
        } while (n2 < 50);
        System.out.println();
    }

    private static void part9() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }
    }
}
