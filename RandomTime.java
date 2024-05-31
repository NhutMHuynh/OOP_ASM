import java.util.Random;
public class RandomTime {
    public static void main(String[] args) {
        Random rand = new Random();
        int Hours = rand.nextInt(24);
        int Minutes = rand.nextInt(60);
        int Seconds = rand.nextInt(60);
        System.out.println("Time: " + Hours + " hours, " + Minutes + " minutes, " + Seconds + " seconds");
    }
}
