public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {7,5,9,2,6};
        int ans = -1;
        int target = 90;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
            }
        }
        System.out.println(ans);
    }


}
