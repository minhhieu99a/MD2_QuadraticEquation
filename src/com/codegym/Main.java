package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter variable a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter variable b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter variable c : ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and" + quadraticEquation.getRoot2());
        }
        else if (delta == 0) {
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
