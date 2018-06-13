package ru.nazarkot.education;

public class NTEST1 {


    public static void main(String[] array) {

        Point p1 = new Point(3.0,6.0);

        Point p2 = new Point(5.0,9.0);
        System.out.println("Расстояние(2 точки в одном месте) = "  + pointdistance(p1,p2));

    }

    public static double pointdistance (Point p1,Point p2)
    {

        double AC = p2.x1 - p1.x1;
        double BC = p2.y1 - p1.y1;

        double result = ( Math.sqrt(Math.pow(AC,2.0) ) + Math.sqrt(Math.pow(BC,2.0) ) ) ;
        return result;
    }


}