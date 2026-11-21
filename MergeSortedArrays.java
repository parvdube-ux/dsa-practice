import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,2,0,0};
        int nums2[] = {2,5,6};

        int j = 0;

        for(int i=nums1.length- nums2.length; i<nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
}
