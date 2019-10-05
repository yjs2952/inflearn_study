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
        //MeetingRoom a = new MeetingRoom();

        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 3);

        Interval[] intervals = {in1, in2, in3};
        for (int i = 0; i < 10; i++) {
            System.out.println(solve(intervals));
        }
    }

    private static boolean solve(Interval[] intervals) {
        Comparator<Interval> comp1 = Comparator.comparingInt(Interval::getStart);
        Comparator<Interval> comp3 = new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.getStart() - o2.getStart();
            }
        };
         Comparator<Interval> comp2 = Comparator.comparingInt(Interval::getStart);

        if (intervals == null || intervals.length == 0) {
            throw new RuntimeException("배열이 비어있습니다.");
        }

        long start1 = System.nanoTime();
        Arrays.sort(intervals, comp2);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        Arrays.sort(intervals, comp3);
        long end2 = System.nanoTime();

        System.out.println("람다 인거 : " + (end1 - start1));
        System.out.println("람다 아닌거 : " + (end2 - start2));

        for (int i = 1; i < intervals.length - 1; i++) {
            if (intervals[i-1].getEnd() > intervals[i].getStart()) {
                return false;
            }
        }
        return true;
    }
}