package coding_exercises_level_one;

public class PlayingCat {

    // The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer,
    // then the upper limit is 45 (inclusive) instead of 35.
    //Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && temperature > 24 &&  temperature < 46){
            return true;
        }
        if (!summer && temperature > 24 &&  temperature < 36){
            return true;
        }
        return false;
    }
}
