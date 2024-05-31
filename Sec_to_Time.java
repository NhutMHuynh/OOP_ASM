
import java.util.Scanner;

public class Sec_to_Time {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.println("Enter number of times:");
        int numberOfTimes = dd.nextInt();
        int[] vars = new int[numberOfTimes];
        //int totalSeconds = 0;
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Enter next total Seconds: ");
            vars[i] = dd.nextInt();
            if ( vars[i] < 10000 && vars[i] > 500 ) {
                int hours = vars[i] / 3600;
                int remainingSeconds = vars[i] % 3600;
                int minutes = remainingSeconds / 60;
                int seconds = remainingSeconds % 60;
                //Main timing = new Main(dd.nextInt());
                // Get the input hours, minutes, seconds and remaining seconds from the Main file
                //int hours = timing.getHours();
                //int remainingSeconds = timing.getRemainingSeconds();
                //int minutes = timing.getMinutes(remainingSeconds);
                //int seconds = timing.getSeconds(remainingSeconds);
                // If hour is over 25, then reset the hour to 0
                if (hours >= 25) {
                    hours %= 24;
                }
            System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
            }
            else {
              System.out.println("Invalid Time");
            }
        }
    }
}
