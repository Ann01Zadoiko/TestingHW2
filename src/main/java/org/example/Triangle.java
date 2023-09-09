package org.example;

public class Triangle {

    public int findPerimeter(int a, int b, int c){
        return a + b + c;
    }

    public boolean isEquilateral(int angle1, int angle2, int angle3){
        if ((angle2 == angle1) && (angle1 == angle3))
            return true;
        return false;
    }

    public int findHeight(int a, int sqr){
        return (2 * sqr) / a;
    }

    public double[] findSidesOfEquilateralTriangle(double sqr, int h){
        double a = (2 * sqr) / h;
        double b = Math.sqrt((h * h) + Math.pow(0.5 * a,2));
        double triangle [] = new double[]{a, b, b};
        return triangle;
    }
}
