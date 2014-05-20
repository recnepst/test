package com.company;

/**
 * Created by rq0862 on 5/19/14
 */
public class Pentagon extends Shape implements iShape{
   // private int[]sides = null;

    public Pentagon(int[] sidesIn)
    {
       super(sidesIn);
       validatePentagon(sidesIn);
    }
    private void validatePentagon(int[]sidesIn)
    {
        if(sidesIn.length !=5)
        {
            throw new IllegalArgumentException("Not a pentagon.  Five sides were not given for a Pentagon, sides provided = " + sidesIn.length);
        }
    }

    public double getArea()
    {
        return .25 * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))) * Math.pow(sides[0], 2);
    }
}
