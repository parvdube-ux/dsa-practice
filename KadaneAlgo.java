public class KadaneAlgo {
    public static void main(String[] args){
        int[] nums= {-2,0,-1};

        int maxi = Integer.MIN_VALUE;
        int prod = 1;

        for(int i=0; i< nums.length; i++){
            prod = prod * nums[i];

            if(prod>maxi){
                maxi = prod;
            }

            if(prod<0){
                prod=0;
            }

        }

        System.out.println(maxi);
    }
}
