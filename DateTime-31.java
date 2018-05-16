import java.time.Duration;
import java.time.LocalDateTime;

public class DateTime31 {

    public static void main(String[] args)
    {
        LocalDateTime dateTime = LocalDateTime.of(2016, 9, 16, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.now();
        int diffInNano = Duration.between(dateTime, dateTime2).getNano();
        long diffInSeconds = Duration.between(dateTime, dateTime2).getSeconds();
        long diffInMilli = Duration.between(dateTime, dateTime2).toMillis();
        long diffInMinutes = Duration.between(dateTime, dateTime2).toMinutes();
        long diffInHours = Duration.between(dateTime, dateTime2).toHours();
        System.out.printf("\nDifference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano\n\n",
                diffInHours, diffInMinutes, diffInMilli, diffInSeconds, diffInNano );

    }
}
