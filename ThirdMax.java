
import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 1};

        Arrays.sort(arr);

        int count = 0;
        int f = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            count++;

            if (count == 3) {
                f = arr[i];
            }
        }

        System.out.println(f);
    }
}
