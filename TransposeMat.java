import java.util.Arrays;

public class TransposeMat {
    public static void main(String[] args) {
        int arr[][] = {{2,3,-1},{-10,5,11},{18,-7,6}};
        int m = arr.length;
        int n = arr[0].length;
        int [][] res = new int[n][m];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
