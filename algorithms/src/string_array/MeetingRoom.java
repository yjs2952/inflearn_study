package string_array;

import java.util.Arrays;

class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class MeetingRoom {
    public static void main(String[] args) {
        MeetingRoom a = new MeetingRoom();


        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 30);

        Interval[] intervals = {in1, in2, in3};
        System.out.println(a.solve(intervals));
    }

    private boolean solve(Interval[] intervals){


        return true;
    }
}
