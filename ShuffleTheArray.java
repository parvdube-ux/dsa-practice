import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 3, 4, 7};
        int arr[] = new int[nums.length];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            arr[count] = nums[i];
            arr[count+1] = nums[i+arr.length];
            count +=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
