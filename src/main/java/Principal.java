//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        /*double meal_cost = 12.0;
        int tip_percent = 20;
        int tax_percent = 8;

        double sum0 = (meal_cost / 100) * tip_percent;
        System.out.println(sum0);
        System.out.println();

        double sum1 = ((double)tax_percent / 100) * meal_cost;
        System.out.println("Realizando o casting de int para double: " + sum1);
        for(int i=0;i<75;i++){System.out.print("_");};
        System.out.println();

        double sum2 = (tax_percent / 100) * meal_cost;
        System.out.println("Sem realizar o casting de int para double: " + sum2);
        for(int i=0;i<75;i++){System.out.print("_");};
        System.out.println();

        double sumTotal = meal_cost + sum0 + sum1;
        System.out.println(Math.round(sumTotal));*/

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N % 3 == 0) {
            System.out.println("Weird");

        } else if (N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");

        } else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");

        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");

        }*/

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i <= T; i++) {
            String s = sc.nextLine();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(s.charAt(j));
                }
            }

            System.out.print(" ");

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 != 0) {
                    System.out.print(s.charAt(j));
                }
            }
        }

    }
}
