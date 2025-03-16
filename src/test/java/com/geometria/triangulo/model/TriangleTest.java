package com.geometria.triangulo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    private Triangle triangle;

    @Test
    void testCalculateArea() {
        triangle = new Triangle(6.0, 4.0);
        assertEquals(12.0, triangle.calculateArea());
    }

    @Test
    void testCalculatePerimeter() {
        triangle = new Triangle(3.0, 4.0, 5.0);
        assertEquals(12.0, triangle.calculatePerimeter());
    }
}
