package com.perscholas.java_basics;

public class JavaBasicsClass {

    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
        part6();
        part7();
        part8();
    }

    //    Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
    //    Assign the sum to a variable. Print out the result.
    private static void part1() {
        int a = 10;
        int b = 10;
        int sum = a + b;
        System.out.printf("%d + %d = %d\n\n", a, b, sum);
    }

    //    Write a program that declares 2 double variables, assigns a number to each, and adds them together.
    //    Assign the sum to a variable. Print out the result.
    private static void part2() {
        double a = 10;
        double b = 10;
        double sum = a + b;
        System.out.printf("%.2f + %.2f = %.2f\n\n", a, b, sum);
    }

    //    Write a program that declares an integer variable and a double variable, assigns numbers to each, and
    //    adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?
    private static void part3() {
        int a = 10;
        double b = 10;
        double sum = a + b;
        System.out.printf("%d + %.2f = %.2f\n\n", a, b, sum);
    }

    //    Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number
    //    by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number
    //    to a decimal. What happens? What corrections are needed?
    private static void part4() {
        int a = 100;
        int b = 2;
        System.out.println(b);

        int result = a / b;
        System.out.printf("%d / %d = %d\n\n", a, b, result);
    }

    //    Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the
    //    smaller. Assign the result to a variable. Print out the result. Now, cast the result to an integer.
    //    Print out the result again.
    private static void part5() {
        double a = 100;
        double b = 2;
        double result = a / b;
        System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
        System.out.printf("%.2f / %.2f = %d\n\n", a, b, (int) result);
    }

    //    Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a
    //    variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
    private static void part6() {
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.printf("%d / %d = %d\n\n", x, y, q);
        //q = (double) y;  Error
        //System.out.print(q);
    }

    //    Write a program that declares a named constant and uses it in a calculation. Print the result.
    private static void part7() {
        final int A = 10;
        int b = 10;
        int sum = A + b;
        System.out.printf("%d + %d = %d\n\n", A, b, sum);
    }

    //    Write a program where you create 3 variables that represent products at a cafe. The products could be
    //    beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create 2 more
    //    variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of
    //    the second product, and 2 items of the third product. Add them all together to calculate the subtotal.
    //    Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
    //    Be sure to format the results to 2 decimal places.
    private static void part8() {
        double coffee = 2.50;
        double cappuccino = 3.00;
        double espresso = 2.75;

        double subtotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);
        double totalSale;
        final double SALES_TAX = 0.0875;
        totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Total Sale: $%.2f", totalSale);
    }

}