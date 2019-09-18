package coding_exercises_level_one;

public class HoursMinutesSecondsChallenge {

    public void getDurationString(int minutes, int seconds) {

        int secondsCount = 0;
        if (minutes > 0 || seconds >= 0 && seconds <=59){
            secondsCount = (minutes * 60) + seconds;
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println((secondsCount / 3600)  + "h " + (secondsCount % 3600) / 60 + "m " + secondsCount % 60 + "s");
    }

    public void getDurationString(int seconds) {

        if (seconds >= 0 ){
            int minutes = (seconds % 3600) / 60;
            int secondsCount = seconds % 60;
            getDurationString(minutes, secondsCount);
        } else {
            System.out.println("Invalid Input");
        }

    }

    public static void main(String[] args) {
        HoursMinutesSecondsChallenge challenge = new HoursMinutesSecondsChallenge();
        challenge.getDurationString(600, 10);
        challenge.getDurationString(600);
    }

}
