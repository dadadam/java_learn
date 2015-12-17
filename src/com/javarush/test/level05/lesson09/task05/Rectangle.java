package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{

    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int left, int top, int height)
    {
        this.left = left;
        this.top = top;
        this.width = height;
        this.height = height;
    }

    public Rectangle(Rectangle anotherRectangle)
    {
        anotherRectangle.top = this.top;
        anotherRectangle.left = this.left;
        anotherRectangle.width = this.width;
        anotherRectangle.height = this.height;
    }

}
