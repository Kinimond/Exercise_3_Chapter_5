package com.company;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a value to test: ");
        int a = 3;
        int b = 6;
        int c = 9;
        int n = in.nextInt();

        if (n > 2 && pow(a, n) + pow(b, n) == pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work");
        }

    }
}
