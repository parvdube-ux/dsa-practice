import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args){
        int nums[] = {3,1,2,4};
        int arr[] = new int[nums.length];

        int e = 0;
        int o = arr.length-1;

        for(int num : nums){
            if(num%2==0){
                arr[e] = num;
                e++;
            }
            else{
                arr[o] = num;
                o--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
