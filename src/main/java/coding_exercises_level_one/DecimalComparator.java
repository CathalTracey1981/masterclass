package coding_exercises_level_one;

public class DecimalComparator {

    //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    //
    //The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {

        if ( (int) (numOne * 1000) == (int) (numTwo * 1000) ){
            return true;
        }
        else {
            return false;
        }
    }
}
