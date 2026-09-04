import java.util.Arrays;

public class Removedup {
    public static void main(String[] args){
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i = i+1;
            }
        }
        System.out.println(i+1);

    }
}
