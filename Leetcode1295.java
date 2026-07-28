public class Leetcode1295 {
    public static void main(String args[]){

        int nums[] = {2,45,3,2,5};

        int count = 0;

        for(int i=0; i<nums.length;i++){
            if(String.valueOf(nums[i]).length() % 2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
