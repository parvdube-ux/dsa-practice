public class CheckifSorted2 {
    public static void main(String[] args){
        int[] arr= {2,1,3,4};
        int cnt = 0;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                cnt = cnt+1;
            }
        }
        if(arr[arr.length - 1] > arr[0]){
            cnt++;
        }

        if(cnt <= 1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
