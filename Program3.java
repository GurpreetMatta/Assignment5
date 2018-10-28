/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author Gurpreet Singh
 */
public class Program3 {
    public static void main(String args[])
    {
        String str1,str2;
        System.out.println("Enter 2 number ");
        Scanner s=new Scanner(System.in);
        str1=s.nextLine();
        str2=s.nextLine();
        int a=Integer.parseInt(str1);
        int b=Integer.parseInt(str2);
        if(a>b)
             System.out.println("max of two is "+a);
        else
             System.out.println("max of two is "+b);
    }
}
