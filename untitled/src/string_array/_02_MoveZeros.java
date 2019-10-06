package string_array;

import java.util.Arrays;

public class _02_MoveZeros {

    private static void solution(int[] input){
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                input[index] = input[i];
                index++;
            }
        }

        for (int i = index; i < input.length; i++) {
            input[i] = 0;
        }

        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 3, 12};

        solution(input);
    }
}
