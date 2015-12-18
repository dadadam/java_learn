package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum = 0;
        int  minimum = 0;

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt( reader.readLine() );

            if (maximum == 0 && minimum == 0) {
                maximum = array[i];
                minimum = array[i];
            }
            else if (maximum < array[i]) maximum = array[i];
            else if (minimum > array[i]) minimum = array[i];
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
