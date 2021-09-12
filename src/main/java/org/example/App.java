/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Date d=new Date();
        int year =d.getYear();
        int age, age_r, t_left, year2;
        System.out.print("What is your current age? ");
        age = user_input.nextInt();
        System.out.print("At what age would you like to retire ");
        age_r = user_input.nextInt();
        int currentYear=year+1900;
        t_left = (age_r-age);
        year2 = (currentYear + t_left);
        System.out.println(String.format("You have %d years left until you can retire", t_left));
        System.out.println(String.format("Its %d, so you can retire in %d", currentYear, year2));
    }
}
