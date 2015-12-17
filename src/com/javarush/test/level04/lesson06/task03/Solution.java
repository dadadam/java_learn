package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());//Напишите тут ваш код
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (a > b)
        {
            if (b > c){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }

            else
            {
                if (a < c)
                {
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b);
                }
                else
                {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                }
            }
        } else
        {
            if (b < c){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
            else
            {
                if (a < c){
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a);
                }
                else {
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println(c);
                }
            }
        }
    }
}
