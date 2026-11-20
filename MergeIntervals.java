
import java.util.*;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ls = new ArrayList<>();

        ls.add(intervals[0]);

        for (int j = 1; j < intervals.length; j++) {

            int[] last = ls.get(ls.size() - 1);
            int[] curr = intervals[j];

            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            }
            else {
                ls.add(curr);
            }
        }

        return ls.toArray(new int[ls.size()][]);
    }
}
