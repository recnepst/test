package com.company;

/**
 * Created by rq0862 on 5/20/14.
 */
public class Shape {
    int[] sides;

    public Shape(int[] inSides)
    {
        sides = inSides;
    }

    public int getPerimeter()
    {
        int perimeter = 0;
        for (int i = 0; i < sides.length; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }
}
