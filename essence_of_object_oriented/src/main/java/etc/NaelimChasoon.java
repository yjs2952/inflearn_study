package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NaelimChasoon {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);
        String[] strArr = str.split("");
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < str.length(); i++) {
            list.add(Integer.parseInt(strArr[i]));
        }

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        Collections.sort(list, comp);

        String moonza = "";

        for (int a : list) {
            moonza = moonza + a;
        }

        return Long.parseLong(moonza);
    }
}
