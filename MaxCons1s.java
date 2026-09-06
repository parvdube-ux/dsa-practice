import java.util.Arrays;

public class MaxCons1s {
    public static void main(String[] args){
        int a[] = {1,1,0,1,1,1};

        int cnt = 0;
        int max[] = new int[a.length];
        int j=0;


        for(int i=0; i<a.length;i++){
            if(a[i]==1){
                cnt++;
            }
            else{



                max[j] = cnt;
                j++;
                cnt = 0;

            }
        }

        max[j] = cnt;

        int largest = Arrays.stream(max).max().getAsInt();

        System.out.println(largest);

    }
}
