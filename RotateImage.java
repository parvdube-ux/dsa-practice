import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int arr[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int n = arr.length;


        for(int i=0;i<n;i++){
                for(int j=i+1; j<n; j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;

                }
            }

        for(int i=0;i<n;i++){
            for(int j=0; j<n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;

            }
        }


        System.out.println(Arrays.toString(arr));

    }
}
