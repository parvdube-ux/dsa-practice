public class BinarySearch {
    public static void main(String[] args){
        int arr[]={17,30,39,56,77,99};
        int ans = -1;
        int target = 100;

        int s=0;
        int e= arr.length-1;
        while(s <= e){
            int mid = (s+e)/2;

            if(arr[mid]==target){
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        System.out.println(ans);

    }
}
