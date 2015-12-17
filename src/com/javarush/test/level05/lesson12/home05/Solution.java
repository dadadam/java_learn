package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int sum = 0;
        int i = 0;

        while (true)
        {
            str = reader.readLine();

            if (str.equals("сумма")) {
                break;
            }

            i = Integer.parseInt(str);
            sum += i;
        }

        System.out.println(sum);
    }
}
