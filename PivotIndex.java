public class PivotIndex {
    public static void main(String[] args){
        int a[] = {1,7,3,6,5,6};
        int n = a.length;


        for(int i=0; i<n;i++){
            int rsum = 0;
            int lsum = 0;
            if(i != n-1){
                for(int j=i+1; j<n; j++){
                    rsum += a[j];
                }
            }
            if(i != 0){
                for(int j=i-1; j>=0; j--){
                    lsum += a[j];
                }
            }

            if(lsum==rsum){
                System.out.println(i);
            }
        }
    }
}
