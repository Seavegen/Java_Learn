/*
Даны три целых числа найти количество положительных чисел в исходном наборе
 */

package com.company;

import java.util.*;

public class snippet_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для a: ");
        int a = sc.nextInt();
        System.out.print("Введите число для b: ");
        int b = sc.nextInt();
        System.out.print("Введите число для c: ");
        int c = sc.nextInt();
        double k = 0, ko = 0;

        if (a > 0) k++;
        else if (a < 0)ko++;
        if (b > 0) k++;
        else if (b < 0)ko++;
        if (c > 0) k++;
        else if (c < 0)ko++;

        System.out.println("k(>0) = "+k);
        System.out.print("ko(<0) = "+ko);

    }

}
