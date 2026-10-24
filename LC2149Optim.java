import java.util.Arrays;

public class LC2149Optim {
    public static void main(String[] args){
        int nums[] = {3,1,-2,-5,2,-4};

        int arr[] = new int[nums.length];

        int pos = 0;
        int neg = 1;

        for(int num : nums){
            if(num > 0){
                arr[pos] = num;
                pos += 2;
            }
            else{
                arr[neg] = num;
                neg += 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
