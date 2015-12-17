package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{

    String name;
    String color;
    String height;

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String name, String height)
    {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, String height, String color)
    {
        this.name = name;
        this.color = color;
        this.height = height;
    }

}
