package com.Dayeightwork;
import java.util.Scanner;


public class UCOne {

    public static void main(String args[]) {

        System.out.println("Welcome !");

        Scanner s = new Scanner(System.in);
        int isEmployee = s.nextInt();
        System.out.println(isEmployee);

        if (isEmployee == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

    }
}
