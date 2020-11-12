/*
Дано целое число, Если оно является положительное,
то прибавить к нему 1 если отрицательным то вычесть из него 2,
если нулевым то заменить его на 10.
вывести полученное число
 */
package com.company;
import java.util.*;

public class snippet_2
{
    public static void main(String []args){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        num = sc.nextInt();
        if (num > 0)
        {
            num = num + 1;
            System.out.printf("Введено положительное число %d", num);
        }
        else if (num < 0)
        {
            System.out.printf("Введено отрицательное число %d", num - 2);
        }
        else{
            System.out.printf("Введено число 0 по условию задачи заменяю на %d", num = 10);
        }
    }
}

