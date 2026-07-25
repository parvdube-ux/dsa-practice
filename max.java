public class max {
    public static void main(String[] args){
        int arr[] = {2,7,3,5,1};

        int max = arr[0];
        int secmax = arr[1];

        for(int i = 1; i < 5; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax) {
                secmax = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
