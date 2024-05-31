public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Getter for hours
    public int getHours() {
        return hours;
    }

    // Setter for hours
    public void setHours(int hours) {
        this.hours = hours;
    }

    // Getter for minutes
    public int getMinutes() {
        return minutes;
    }

    // Setter for minutes
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // Getter for seconds
    public int getSeconds() {
        return seconds;
    }

    // Setter for seconds
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


}