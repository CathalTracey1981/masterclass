package coding_exercises_level_one;

public class MinutesToYearsAndDaysCalculator {

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

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + "min = " + years + "y and " + remainingDays + "d");
        }
    }

    public static void main(String[] args) {
        MinutesToYearsAndDaysCalculator calculator = new MinutesToYearsAndDaysCalculator();
        calculator.printYearsAndDays(525600);
    }
}
