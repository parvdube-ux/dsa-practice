import java.util.*;

class PascalTri1 {

    static long ncr(int n, int r) {
        long res = 1;

        for(int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

            List<Integer> ls = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                ls.add((int)ncr(i, j));
            }

            ans.add(ls);
        }

        return ans;
    }
}
