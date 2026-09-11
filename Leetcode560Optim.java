import java.util.HashMap;

public class Leetcode560Optim {
    public static void main(String[] args){
        int nums[] = {1,2,3};
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int required = sum - k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }



    }
}
