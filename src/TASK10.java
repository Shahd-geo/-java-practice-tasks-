import java.util.Arrays;
public class TASK10 {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2};
        System.out.println(Arrays.toString(post4(arr)));

    }

    public static int[] post4(int[] arr) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                last = i;
            }
        }
        int[] result = new int[arr.length - last - 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[last + 1 + i];
        }

        return result;
    }
}