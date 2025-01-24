//Write a program in java to take the input from the user

import java.util.*;
public class Practical01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
        sc.close();
    }
}