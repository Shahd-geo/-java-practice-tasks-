import java.util.Arrays;
public class TASK11 {
    static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 10, 2};
        System.out.println(Arrays.toString (withoutTen(arr)));

    }
    public static int[]withoutTen(int[] arr){
        int index = 0;
        for (int i = 0;i <arr.length;i++){
            if (arr[i] != 10){
                arr[index]=arr[i];
            index++;
            }
        }
        for (int i = index;i< arr.length; i++){
            arr[i]=0;
        }
        return arr;

    }
}
