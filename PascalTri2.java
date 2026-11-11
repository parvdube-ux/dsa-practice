import java.util.*;

class PascalTri2 {

    static long ncr(int n, int r) {
        long res = 1;

        for(int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++) {
            ls.add((int)ncr(rowIndex, i));
        }

        return ls;
    }
}