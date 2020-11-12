package com.company;

import java.util.*;

public class Snippet_1 {
    public static void main(String[] args) {
        int num = 0;

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        if (num > 0){
            num = num + 1;

            System.out.printf("Введено число: %d \n",num);
        }
        else{
            System.out.println("Число может быть только положительным");
        }

        in.close();

    }
}


