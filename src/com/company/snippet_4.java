/*
Заполнить массив длиной 7 так, как показано ниже:

3 6 9 12 15 18 21
 */
package com.company;
import java.util.Scanner;

public class snippet_4
{
    public static void main(String []args)
    {
        int[] a = new int[7];
        for (int i = 0; i<7; i++)
        {
            a[i] = 3*(i+1);
            System.out.printf("%d,", a[i]);
        }

    }
}
