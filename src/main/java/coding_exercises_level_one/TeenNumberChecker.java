package coding_exercises_level_one;

public class TeenNumberChecker {

    //We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    //
    //Write a method named hasTeen with 3 parameters of type int.
    //
    //The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static boolean hasTeen(int first, int second, int third){
        if ((first > 12 && first <20) || (second > 12 && second <20) || (third > 12 && third <20)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        if (age > 12 && age <20){
            return true;
        }
        return false;
    }


}
