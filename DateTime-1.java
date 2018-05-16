import java.util.Calendar;

public class DateTime1 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2018);
        calendar.set(Calendar.MONTH,05);
        calendar.set(Calendar.DATE,16);
        System.out.println(calendar.getTime());
        System.out.println();

    }


}
