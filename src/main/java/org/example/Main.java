package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите значение для m: ");
        double m= scanner.nextDouble();
        System.out.println("Введите значение для n: ");
        double n= scanner.nextDouble();
        double m10=Math.abs(m-10);
        double n10=Math.abs(n-10);
        if (m10<n10){
            System.out.println("Число " + m + " ближе 10.");}
            else if (m10>n10){
                System.out.println("Число " + n + " ближе 10.");}
            else {
            System.out.println( "числo " + m + " и числo " + n + " одинаково близки к 10.");}
    }
}