package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int min = 10;

        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);

            if (s.length() < min) min = s.length();
        }


        for (String aList : list)
        {
            if (aList.length() == min)
            {
                System.out.println(aList);
            }
        }

    }
}
