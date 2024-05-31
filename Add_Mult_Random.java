import java.util.Random;
import java.util.Scanner;

public class Add_Mult_Random {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalHours = 0, totalMinutes = 0, totalSeconds = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times: ");
        int numTimes = scanner.nextInt();
        for (int i = 0; i < numTimes; i++) {
            int hours = rand.nextInt(24);
            int minutes = rand.nextInt(60);
            int seconds = rand.nextInt(60);
            System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
            // Add to total
            totalHours += hours;
            totalMinutes += minutes;
            totalSeconds += seconds;
        }
        // If total seconds are over 60, round total seconds with 60 and take the remaining as seconds, the result is added to total minutes
        if(totalSeconds >= 60) {
            totalMinutes += totalSeconds / 60;
            totalSeconds %= 60;
        }
        // If total minutes are over 60, round total minutes with 60 and take the remaining as minutes, the result is added to total hours
        if(totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes %= 60;
        }
        // If total hours are over 24, round total hours with 24 and take the remaining as total hours
        if(totalHours >=25)
        {
            totalHours %=24;
        }

        // Display total time
        System.out.println("Total time: " + totalHours + " hours, " + totalMinutes + " minutes, " + totalSeconds + " seconds");
    }

}

