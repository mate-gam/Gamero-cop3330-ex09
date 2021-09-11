/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
import java.lang.Math;
public class App
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length? ");
        int len = sc.nextInt();
        System.out.print("What is the width? ");
        int wid = sc.nextInt();
        int area = len * wid;
        float gallons = (float) Math.ceil( (float)area / 350);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet\n", gallons, area);
    }
}
