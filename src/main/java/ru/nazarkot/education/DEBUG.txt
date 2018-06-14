package ru.nazarkot.education;


public class NTEST1 {





    public static void main(String[] array) {

        NTEST2 t1 = new NTEST2();
        t1.l =  5.0;
        t1.color = "Performce Blue";
        System.out.println("Площадь квадрата цвета: " + t1.color + " равна = " + sqrt2(t1));



        Triangle t2 = new Triangle();
        t2.a =  5.0;
        t2.b = 6.0;
        System.out.println("Площадь треугольника = "  + triangleArea2(t2));





        double c0 = 10;
        System.out.println("Значение переменной С0 = " + c0);
        System.out.println("Площадь квадрата = " + sqrt(25));

        System.out.println("Площадь треугольника = " + triangleArea(15,25));
    }

    public static double sqrt(double n) {

        double result = n*n;
        return result;
    }


    public static double sqrt2(NTEST2 t1) {

        return t1.l * t1.l ;
    }

    public static double triangleArea (double a, double b)
    {

        double result = ((a*b) / 2.0 );
        return result;
    }



    public static double triangleArea2 (Triangle t2)
    {


        return ((t2.a * t2.b) / 2.0 );
    }


}