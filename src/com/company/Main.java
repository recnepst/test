package com.company;

public class Main {

    public static void main(String[] args) {

        String startString = new String("Hello Everybody.");
        String finishString = new String();
        char[] stringBits = startString.toCharArray();
//        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};


        for (int i=0; i<stringBits.length; i++)
        {
            if(i%2==0)
            {
                finishString+=stringBits[i];
            }
        }
            System.out.println(finishString);



        int[] sides = new int[]{4, 4, 4};
        int[] angles = new int[]{60, 60, 60};

        iShape shape = getShape(sides, angles);
        String shapeName = getShapeName(sides);
        System.out.println("Shape Name = " + shapeName);
        System.out.println("The area of the shape is " + shape.getArea());
        System.out.println("The perimeter of the shape is " + shape.getPerimeter());
        int perimeter = getPerimeter(sides);

        double area = 0;
        try {
            int y = 1;
            int b = 0;
            int x = y / b;
        } catch (ArithmeticException e) {
            System.out.println("Bad b");
        } catch (Exception e) {
            System.out.println("Error:::::: *****" + e.getMessage());
        } finally {
            System.out.println("Finally");
        }


//        switch (sides.length) {
//            case 3:
//                shapeName = "Triangle";
//                break;
//            case 4:
//                shapeName = "Rectangle";
//                area = getArea(sides);
//                break;
//            case 5:
//                shapeName = "Pentagon";
//                area = getArea(sides);
//                break;
//            case 6:
//                shapeName = "Hexagon";
//                break;
//            default:
//                shapeName = "N\\A";
//        }
        System.out.println("The shape " + shapeName + " has a perimeter of " + perimeter + " and an area of " + area);
    }

    static int getPerimeter(int[] sides) {
        int perimeter = 0;

        for (int i = 0; i < sides.length; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }



    static String getShapeName(int[] sides) {
        String shapeName;

        switch (sides.length) {
            case 3:
                shapeName = "Triangle";
                break;
            case 4:
                shapeName = "Rectangle";
                break;
            case 5:
                shapeName = "Pentagon";
                break;
            case 6:
                shapeName = "Hexagon";
                break;
            default:
                shapeName = "N\\A";
        }
        return shapeName;
    }

    static double getArea(int[] sides) {
        switch (sides.length) {
            case 3:
                return .25 * Math.sqrt(4 * Math.pow(sides[0], 2) * Math.pow(sides[1], 2) - Math.pow(Math.pow(sides[0], 2) + Math.pow(sides[1], 2) - Math.pow(sides[2], 2), 2));
            case 4:
                return sides[0] * sides[2];
            case 5:
                return .25 * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))) * Math.pow(sides[0], 2);
            default:
                return 0;
        }
    }

    static iShape getShape(int[] sides, int[] angles){
        iShape tSides = null;
        if (sides.length == 3) {
            tSides = new Triangle(sides, angles);
            System.out.println("Triangle perimeter = " + tSides.getPerimeter());
            System.out.println("Triangle area = " + tSides.getArea());
        }

        if (sides.length == 5) {
            tSides = new Pentagon(sides);
            System.out.println("Pentagon perimeter = " + tSides.getPerimeter());
            System.out.println("Pentagon area = " + tSides.getArea());
        }
        return tSides;
    }

    }


