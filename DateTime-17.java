import java.time.LocalTime;

public class DateTime17 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println("\nCurrent Local time: " + time);
        System.out.println("Hour: " + hour);
        System.out.println("Minue: " + minute);
        System.out.println("Second: " +second+"\n");
    }
}
