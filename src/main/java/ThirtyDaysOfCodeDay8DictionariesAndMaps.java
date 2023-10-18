import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThirtyDaysOfCodeDay8DictionariesAndMaps {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<String, String>();

        Scanner sc = new Scanner(System.in);

        int numberOfEntries = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfEntries; i++) {
            String entry = sc.nextLine();
            String[] entryDivided = entry.split(" ");
            phoneBook.put(entryDivided[0], entryDivided[1]);
        }

        //sc.next();

        do {
            String entryName = sc.nextLine();
            if (phoneBook.containsKey(entryName)) {
                System.out.println(entryName + "=" + phoneBook.get(entryName));
            } else {
                System.out.println("Not found");
            }
        } while (sc.hasNext());

        sc.close();
        /*for (String key :
                phoneBook.keySet()) {

            if (phoneBook.keySet().equals(entry)) {
                System.out.println(phoneBook.get(entry));
            } else {
                System.out.println("Not found");
            }
        }*/
    }
}
