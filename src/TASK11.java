import  java.util.Arrays;
public class TASK11 {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 1, 2, 3, 4};
        System.out.println(Arrays.toString(withoutTen(arr)));

    }

    public static int[] withoutTen(int[] arr) {
        int count = 0;
        int j = 0;
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                count++;
            } else {
                arrNew[j] = arr[i];
                j++;
            }
        }
        for (int i = arr.length - count; i < arr.length; i++) {
            arrNew[i] = 0;
        }
        return arrNew;

    }
}




