
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // Take the input
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the total number of seconds: ");
        //Main timing = new Main(scanner.nextInt());
        // Get the input hours, minutes, seconds and remaining seconds from the Main file
        //int hours = timing.getHours();
        //int remainingSeconds = timing.getRemainingSeconds();
        //int minutes = timing.getMinutes(remainingSeconds);
        //int seconds = timing.getSeconds(remainingSeconds);
        // Get input for hours
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        // Get input for minutes
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        // Get input for seconds
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        if (hours >= 25) {
            hours %= 24;
        }

        // If hour is over 25, then reset the hour to 0
        if (hours >= 25) {
            hours %= 24;
        }
        System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        scanner.close();
    }
}
