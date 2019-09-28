package string_array;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    private int start;
    private int end;

    Interval() {
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}

public class MeetingRoom {
    public static void main(String[] args) {
        MeetingRoom a = new MeetingRoom();

        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 3);

        Interval[] intervals = {in1, in2, in3};
        System.out.println(a.solve(intervals));
    }

    private Comparator<Interval> comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.getStart() - o2.getStart();
        }
    };

    private boolean solve(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            throw new RuntimeException("배열이 비어있습니다.");
        }

        Arrays.sort(intervals, comp);

        for (int i = 1; i < intervals.length - 1; i++) {
            if (intervals[i-1].getEnd() > intervals[i].getStart()) {
                return false;
            }
        }
        return true;
    }
}
