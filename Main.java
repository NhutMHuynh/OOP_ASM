import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Question 2
        // Get input for hours
        System.out.print("In question 2, enter hours: ");
        int hours2 = scanner.nextInt();
        // Get input for minutes
        System.out.print("In question 2, enter minutes: ");
        int minutes2 = scanner.nextInt();
        // Get input for seconds
        System.out.print("In question 2, enter seconds: ");
        int seconds2 = scanner.nextInt();
        if (seconds2 >= 60) {
            minutes2 += seconds2 / 60;
            seconds2 %= 60;
        }
        if (minutes2 >= 60) {
            hours2 += minutes2 / 60;
            minutes2 %= 60;
        }
        if (hours2 >= 25) {
            hours2 %= 24;
        }

        // If hour is over 25, then reset the hour to 0
        if (hours2 >= 25) {
            hours2 %= 24;
        }
        System.out.println("In question 2, the time is: " + hours2 + ":" + minutes2 + ":" + seconds2);

        // Question 3
        Random rand = new Random();
        int Hours3 = rand.nextInt(24);
        int Minutes3 = rand.nextInt(60);
        int Seconds3 = rand.nextInt(60);
        System.out.println("In question 3, the time is: " + Hours3 + ":" + Minutes3 + ":" + Seconds3);

        // Question 4
        int totalHours4 = 0, totalMinutes4 = 0, totalSeconds4 = 0;
        int numTimes4 = 2;
        for (int i = 0; i < numTimes4; i++) {
            int hours4 = rand.nextInt(24);
            int minutes4 = rand.nextInt(60);
            int seconds4 = rand.nextInt(60);
            // Add to total
            totalHours4 += hours4;
            totalMinutes4 += minutes4;
            totalSeconds4 += seconds4;
        }

        // Adjust total time
        if(totalSeconds4 >= 60) {
            totalMinutes4 += totalSeconds4 / 60;
            totalSeconds4 %= 60;
        }
        if(totalMinutes4 >= 60) {
            totalHours4 += totalMinutes4 / 60;
            totalMinutes4 %= 60;
        }
        if(totalHours4 >=25)
        {
            totalHours4 %=24;
        }
        // Display total time
        System.out.println("In question 4, the total time is: " + totalHours4 + ":" + totalMinutes4 + ":" + totalSeconds4);
        // Question 5
        int totalHours5 = 0, totalMinutes5 = 0, totalSeconds5 = 0;
        System.out.println("In question 5, the number of times to be added: ");
        int numTimes5 = scanner.nextInt();
        for (int i = 0; i < numTimes5; i++) {
            int hours5 = rand.nextInt(24);
            int minutes5 = rand.nextInt(60);
            int seconds5 = rand.nextInt(60);
            System.out.println("The time is: " + hours5 + ":" + minutes5 + ":" + seconds5);
            // Add to total
            totalHours5 += hours5;
            totalMinutes5 += minutes5;
            totalSeconds5 += seconds5;
        }
        // If total seconds are over 60, round total seconds with 60 and take the remaining as seconds, the result is added to total minutes
        if(totalSeconds5 >= 60) {
            totalMinutes5 += totalSeconds5 / 60;
            totalSeconds5 %= 60;
        }
        // If total minutes are over 60, round total minutes with 60 and take the remaining as minutes, the result is added to total hours
        if(totalMinutes5 >= 60) {
            totalHours5 += totalMinutes5 / 60;
            totalMinutes5 %= 60;
        }
        // If total hours are over 24, round total hours with 24 and take the remaining as total hours
        if(totalHours5 >=25)
        {
            totalHours5 %=24;
        }

        // Display total time
        System.out.println("In question 5, the Total time is: " + totalHours5 + ":" + totalMinutes5 + ":" + totalSeconds5);
        // Question 6
        Scanner dd = new Scanner(System.in);
        System.out.println("In question 6, enter number of times:");
        int numberOfTimes5 = dd.nextInt();
        int[] vars = new int[numberOfTimes5];
        //int totalSeconds = 0;
        for (int i = 0; i < numberOfTimes5; i++) {
            System.out.println("Enter next total Seconds, the total seconds must be in the range from 500 to 10000: ");
            vars[i] = dd.nextInt();
            // totalSeconds must be from 500 to 10000
            if ( vars[i] <= 10000 && vars[i] >= 500 ) {
                int hours5 = vars[i] / 3600;
                int remainingSeconds5 = vars[i] % 3600;
                int minutes5 = remainingSeconds5 / 60;
                int seconds5 = remainingSeconds5 % 60;
                if (hours5 >= 25) {
                    hours5 %= 24;
                }
                System.out.println("In question of, the time is: " + hours5 + ":" + minutes5 + ":" + seconds5);
            }
            else {
                System.out.println("Invalid Time");
            }
        }
        scanner.close();
    }
}

