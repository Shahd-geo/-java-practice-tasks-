import java.util.Arrays;
public class TASK22 {
    static void main(String[] args) {
        int[] arr= {1,2,3,2,5};
        int n =2;
        System.out.println(Arrays.toString((notAlone(arr,n))));
    }
    public static int[] notAlone (int [] arr , int n){
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == n &&
                    arr[i - 1] != n &&
                    arr[i + 1] != n) {
                arr[i] = Math.max(arr[i - 1], arr[i + 1]);

            }

        }
        return arr;
    }
}
