public class Leetcode560 {
    public static void main(String[] args){
        int arr[] = {1,1,1};

        int cnt = 0;

        int K = 2;

        for(int i=0 ; i<arr.length; i++){
            int sum = 0;

            for(int j=i; j<arr.length; j++){
                sum += arr[j];

                if(sum == K){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
