import java.util.HashMap;

public class TwoSumHash {
    public static void main(String[] args){
        int arr[] = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int dif = target - arr[i];

            if(mp.containsKey(dif)){
                System.out.println(mp.get(dif)," ",i);
            }
            mp.put(arr[i],i);
        }

        System.out.println(-1,-1);
    }
}
