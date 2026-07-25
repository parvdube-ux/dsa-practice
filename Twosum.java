import java.util.Arrays;

public class Twosum {
    public static void main(String[] args){
        int[] arr = {3,2,4};
        int target = 6;

        int index[] = new int[2];
        for(int i =0; i<arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    System.out.println(Arrays.toString(index));
                    return;
                }

            }
        }
    }
}
