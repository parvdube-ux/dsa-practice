public class FindMissNo {
    public static void main(String[] args){
        int arr[] = {1,2,3,5};
        int store = 0;

        int n = arr.length + 1;

        int hash[] = new int[n+1];

        for(int i=0; i<n-1;i++){
            hash[arr[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                store = i;
            }
        }

        System.out.println(store);


    }
}
