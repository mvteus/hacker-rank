import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ThirtyDaysOfCodeDay10BinaryNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int resto = 0;
        int sum = 0;
        int max = 0;
        ArrayList<Integer> converted = new ArrayList<>();

        while (n > 0) {
            resto = n % 2;
            converted.add(resto);
            n /= 2;
        }

        Collections.reverse(converted);

        for (int i = 0; i < converted.size(); i++) {
            //System.out.print(converted.get(i));
            if (converted.get(i).equals(1)) {
                sum += converted.get(i);
                if(sum > max){
                    max = sum;
                }
            } else {
                sum = 0;
            }
        }

        System.out.println(max);

        bufferedReader.close();

    }
}
