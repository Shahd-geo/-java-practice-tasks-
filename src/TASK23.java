import java.util.Arrays;
public class TASK23 {
    static void main(String[] args) {
        int [] arr = {0,5,0,3};
        System.out.println(Arrays.toString(zeroMax(arr)));

    }
    public static int[]  zeroMax(int[] arr){
        for (int i =0;i<arr.length;i++){
            if (arr[i] ==0){
                int maxadd = 0;
                for (int s = 0;s<arr.length; s++){
                    if (arr[s]%2==1 && arr[s] >maxadd){
                        maxadd=arr[s];
                    }
                    if (maxadd!=0){
                        arr[s]=maxadd;
                }

                }
            }
        }
        return arr;
    }
}
