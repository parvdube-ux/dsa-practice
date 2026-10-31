import java.util.HashSet;

public class LargestConsSeq {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int largest = 0; 

        for (int i = 0; i < n; i++) {

            if (!set.contains(arr[i] - 1)) {

                int currnum = arr[i];
                int count = 1;

                while (set.contains(currnum + 1)) {
                    currnum++;
                    count++;
                }


                largest = Math.max(largest, count);
            }
        }

        System.out.println(largest);
    }
}
