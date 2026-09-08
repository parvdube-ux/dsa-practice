public class FindMissNoOpti {
    public static void main(String[] args){
        int arr[] = {1,2,3,5};

        int sum = 0;

        int n = arr.length+1;

        for(int i=0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        int s2 = (n*(n+1))/2;

        System.out.println(s2-sum);
    }
}
