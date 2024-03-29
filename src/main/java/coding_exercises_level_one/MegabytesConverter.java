package coding_exercises_level_one;

public class MegabytesConverter {

    //Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    //
    //The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
    //
    //Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes +" KB = "+ kiloBytes / 1024 +"MB and " + kiloBytes % 1024 +" KB");
        }
    }
}
