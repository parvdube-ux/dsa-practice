import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int distinct = 0;

        for (int i = 0; i < name.length(); i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distinct++;
            }
        }

        if (distinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
