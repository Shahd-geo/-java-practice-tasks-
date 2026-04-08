import java.util.Arrays;
public class TASK9 {
    static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(Arrays.toString(shiftLeft(arr)));

    }
    public static int[] shiftLeft(int[] arr){
        int frist = arr[0];
        for (int i = 0 ; i< arr.length-1 ; i++){
            arr[i]= arr[i+1];
        }
        arr[arr.length-1]=frist;
        return arr;

    }
}
