import java.util.Arrays;
public class TASK21 {
    static void main(String[] args) {
        int[]arr = {9,4,5,10,1,2,3,20,2,3,4};
        System.out.println(Arrays.toString(tenRun(arr)));

    }
    public static int[]  tenRun(int[] arr){
        int lastTen= 0;
        boolean found = false;
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i]%10 ==0){
                lastTen=arr[i];
                found=true;
            } else if (found) {
                arr[i] = lastTen;
            }

            }
        return arr;
        }
}
