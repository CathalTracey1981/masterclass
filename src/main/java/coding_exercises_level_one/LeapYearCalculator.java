package coding_exercises_level_one;

public class LeapYearCalculator {

    //Write a method isLeapYear with a parameter of type int named year.
    //
    //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    //
    //If the parameter is not in that range return false.
    //
    //Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }
}






