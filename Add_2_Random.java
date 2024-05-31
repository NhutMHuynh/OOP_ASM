import java.util.Random;
public class Add_2_Random {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalHours = 0, totalMinutes = 0, totalSeconds = 0;
        int numTimes = 2;
        for (int i = 0; i < numTimes; i++) {
            int hours = rand.nextInt(24);
            int minutes = rand.nextInt(60);
            int seconds = rand.nextInt(60);
            // Add to total
            totalHours += hours;
            totalMinutes += minutes;
            totalSeconds += seconds;
        }

        // Adjust total time
        if(totalSeconds >= 60) {
            totalMinutes += totalSeconds / 60;
            totalSeconds %= 60;
        }
        if(totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes %= 60;
        }
        if(totalHours >=25)
        {
            totalHours %=24;
        }
        // Display total time
        System.out.println("Total time: " + totalHours + " hours, " + totalMinutes + " minutes, " + totalSeconds + " seconds");
    }

    }

