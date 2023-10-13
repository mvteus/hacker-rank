import java.util.Scanner;

public class ThirtyDaysOfCodeDay6LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<=T;i++){
            String s = sc.nextLine();

            for(int j = 0; j < s.length(); j++){
                if(j%2==0){
                    System.out.print(s.charAt(j));
                }

                if(j==s.length()-1){
                    System.out.print(" ");
                }
            }

            for(int j = 0; j < s.length(); j++){
                if(j%2!=0){
                    System.out.print(s.charAt(j));
                }

                if(j==s.length()-1){
                    System.out.println();
                }
            }

            /*if(i==T){
                System.out.println();
            }*/
        }
    }
}
