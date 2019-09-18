package coding_exercises_level_one;

public class AreaCalculator {

    //Write a method named area with one double parameter named radius.
    //
    //The method needs to return a double value that represents the area of a circle.
    //
    //If the parameter radius is negative then return -1.0 to represent an invalid value.
    //
    //Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
    //
    //The method needs to return an area of a rectangle.
    //
    //If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

    public static double area(double radius){
        if (radius < 0){
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double length, double width){
        if (length < 0 || width < 0){
            return -1;
        }

        return length * width;
    }
}
