import java.util.Scanner;

public class ThirtyDaysOfCodeDay9Recursion3 {

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number to discover his factorial: ");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
}
