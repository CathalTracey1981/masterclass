package coding_exercises_level_one;

public class BarkingDog {

    //We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
    //
    //Write a method shouldWakeUp that has 2 parameters.
    //
    //1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    //2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
    //
    //We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
    //
    //In all other cases return false.

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else if (hourOfDay < 8 || hourOfDay > 22){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
