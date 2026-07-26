public class KidswithCandies {
    public static void main(String[]args ){
        int max = 0;
        for(int i=0; i< candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        int extraCandies = 1;
        boolean result[] = new boolean[candies.length];
        for(int i=0; i< candies.length; i++){
            int sum = candies[i] + extraCandies;
            if(sum >= max){
                result[i] = true;
            }
            else{
                result[i] = false;
            }
        }
        return result[];
    }
}