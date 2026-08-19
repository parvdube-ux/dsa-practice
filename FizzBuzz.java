import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 5;
        String ans[] = new String[n];

        for (int i = 0; i < n; i++) {
            int num = i + 1;

            if (num % 3 == 0 && num % 5 == 0) {
                ans[i] = "FizzBuzz";
            }
            else if (num % 3 == 0) {
                ans[i] = "Fizz";
            }
            else if (num % 5 == 0) {
                ans[i] = "Buzz";
            }
            else {
                ans[i] = String.valueOf(num);
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}