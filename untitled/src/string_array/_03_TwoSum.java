package string_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _03_TwoSum {
    public static void main(String[] args) {
        int[] input = {3, 5, 6, 7, 9 , 12, 19 ,24};
        int target = 33;

        System.out.println(Arrays.toString(solve(input, target)));
    }

    private static int[] solve(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                result[0] = value + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(target - nums[i], i); // (30, 0) (28, 1) (27, 2) (26, 3) (24, 4) (21, 5) (12, 6) (9, 7)

        }
        return null;
    }
}
