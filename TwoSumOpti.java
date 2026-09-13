import java.util.Arrays;

public class TwoSumOpti {
    public static void main(String[] args) {

        int arr[] = {2, 7, 11, 15};
        int t = 9;

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int sum = arr[l] + arr[r];

            if (sum < t) {
                l++;
            }
            else if (sum > t) {
                r--;
            }
            else {
                System.out.println(l + " " + r);
                return;
            }
        }

        System.out.println("-1 -1");
    }
}
