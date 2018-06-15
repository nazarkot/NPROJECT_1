package ru.nazarkot.education;


public class MyFirstProgram {

    public static void main(String[] array) {
       Square s = new Square(15.0);
       Triangle2 tr = new Triangle2(155.0 , 123.0);
       System.out.println("Площадь квадрата равна " + s.sayAreaToo());
        System.out.println("Площадь треугольника равна " + tr.sayArea());
    }


    public static double triangleArea (Triangle2 t){
        double area = ((t.a * t.b) / 2);
        return area;
    }
}