package org.example;

import org.example.Triangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTest {

    @Before
    public void beforeStartTest(){
        System.out.println("Test has been finished at: " + System.currentTimeMillis());
    }

    @After
    public void afterStartTest(){
        System.out.println("Test jas been finished at: " + System.currentTimeMillis());
    }

    @Test
    public void testCheckPerimeter(){
        //Given
        Triangle triangle = new Triangle();
        int a = 5;
        int b = 10;
        int c = 15;

        //When
        int result = triangle.findPerimeter(a,b,c);

        //Then
        assertEquals(30, result);
    }

    @Test
    public void testCheckTriangleIsEquilateralIsTrue(){
        //Given
        Triangle triangle = new Triangle();
        int angle1 = 60;
        int angle2 = 60;
        int angle3 = 60;

        //When
        boolean result = triangle.isEquilateral(angle1, angle2, angle3);

        // Then
        assertTrue(result);
    }

    @Test
    public void testCheckTriangleIsEquilateralIsFalse(){
        //Given
        Triangle triangle = new Triangle();
        int angle1 = 50;
        int angle2 = 50;
        int angle3 = 80;

        //When
        boolean result = triangle.isEquilateral(angle1, angle2, angle3);

        // Then
        assertFalse(result);
    }

    @Test
    public void testCheckTriangleIsEquilateralNotEquals(){
        //Given
        Triangle triangle = new Triangle();
        int a = 5;
        int b = 10;
        int c = 15;

        //When
        int result = triangle.findPerimeter(a,b,c);

        // Then

        assertNotEquals(40, result);
    }

    @Test
    public void testFindHeightOfTriangle() {
        // Given
        Triangle triangle = new Triangle();
        int sqr = 10;
        int a = 0;

        // When & Then
        assertThrows(ArithmeticException.class, () -> {
            triangle.findHeight(a, sqr);
        });
    }

    @Test
    public void testFindSidesOfEquilateralTriangle(){
        //Given
        Triangle triangle = new Triangle();
        double sqr = 48;
        int h = 8;

        //When
        double result [] = triangle.findSidesOfEquilateralTriangle(sqr, h);
        //Then
        double [] excepted = new double[]{12,10,10};
        assertArrayEquals(excepted, result, 0);
    }
}