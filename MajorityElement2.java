import java.util.ArrayList;

public class MajorityElement2 {
    int el1 = Integer.MIN_VALUE;
    int count1= 0;
    int el2 = Integer.MIN_VALUE;
    int count2= 0;
    public ArrayList<Integer> majorityElement(int[] nums) {
        for(int i=0; i< nums.length; i++){
            if(count1 == 0 && nums[i] != el2){
                el1 = nums[i];
                count1++;
            } else if (count2 == 0 && nums[i] != el1) {
                el2 = nums[i];
                count2++;
            } else if (el1 == nums[i]) {
                count1++;
            } else if (el2 == nums[i]) {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
    }

    
}
