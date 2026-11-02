public class PivotIndexOpt {
    public static void main(String[] args){
        int arr[] = {1,7,3,6,5,6};
        int Tsum = 0;
        for(int i = 0; i<arr.length ; i++){
            Tsum += arr[i];
        }
        int Nsum = 0;
        for(int i= 0; i< arr.length; i++){
            Nsum += arr[i];
            if(Tsum - Nsum == Nsum - arr[i]){
                System.out.println(i);
            }
        }
    }
}
