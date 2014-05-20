package com.company;

/**
 * Created by rq0862 on 5/19/14.
 */
public class Triangle extends Shape implements iShape{
    private int[] angles= null;

    public Triangle(int[] sidesIn, int[] anglesIn)
    {
        super(sidesIn);
        angles = anglesIn;
        validateTriangle(sidesIn, anglesIn);
    }

    private void validateTriangle(int[]sidesIn, int[]anglesIn) {
        int sumAngles = 0;
        if(sidesIn.length !=3)
        {
            throw new IllegalArgumentException("Not a triangle. Three sides were not given, sides provided = " + sidesIn.length);
        }
        if(anglesIn.length != 3)
        {
            throw new IllegalArgumentException("Angles entered do not equal three");
        }
        for(int i = 0; i<3; i++)
        {
            sumAngles = sumAngles + anglesIn[i];
        }
        if(sumAngles != 180){
            {
                throw new IllegalArgumentException("Angles do not equal");
            }
        }
    }

    public double getArea()
    {
        return .25 * Math.sqrt(4 * Math.pow(sides[0], 2) * Math.pow(sides[1], 2) - Math.pow(Math.pow(sides[0], 2) + Math.pow(sides[1], 2) - Math.pow(sides[2], 2), 2));
    }

}
