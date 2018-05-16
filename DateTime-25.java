import java.time.Year;

public class DateTime25 {

    public static void main(String[] args) {
        Year yr = Year.now();
        System.out.println("\nCurrent Year: " + yr);
        boolean isLeap = yr.isLeap(); // false
        System.out.println("Is current year leap year? " + isLeap);
        int length = yr.length(); // 365
        System.out.println("Length of the year: " + length+" days\n");
    }
}
