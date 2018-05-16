import java.util.Scanner;

public class DataTypesExercises3 {

    public static void main(String[] args) {
        System.out.print("Input an integer between 0 and 1000:");
        Scanner sc =  new Scanner(System.in);

        int num = sc.nextInt();
        int amount = 0;
        while (num > 0){
            amount += num%10;
            num /= 10;
        }
        System.out.println("The sum of all digits in "+ num +" is "+amount);
    }

}
