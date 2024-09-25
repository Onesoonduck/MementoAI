import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4})));
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        if (arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[num++] = arr[i];
            }
        }
        return answer;
    }
}
