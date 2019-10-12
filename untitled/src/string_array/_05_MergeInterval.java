package string_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _05_MergeInterval {

    static class Interval {
        private int start;
        private int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public static void main(String[] args) {
         int[][] input = {{1,3}, {2,6}, {8,10}, {15,18}};
        solve(input);
    }

    private static void solve(int[][] input){
        Interval[] intervals = new Interval[input.length];

        for (int i = 0; i < input.length; i++) {
            intervals[i] = new Interval(input[i][0], input[i][1]);
        }

        Comparator<Interval> comp = Comparator.comparingInt(o -> o.start);

        /*Comparator<Interval> comp = new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        };*/

        Arrays.sort(intervals, comp);

        System.out.println(Arrays.toString(intervals));

        List<Interval> result = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) {
                if (intervals[i - 1].end > intervals[i].end) {
                    result.add(new Interval(intervals[i - 1].start, intervals[i].end));
                }
                result.add(new Interval(intervals[i - 1].start, intervals[i].end));
            }
        }

        System.out.println(result);
    }
}
