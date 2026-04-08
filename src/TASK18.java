
public class TASK18 {
    static void main(String[] args) {
        int[] arr = {1,2,6,7,8,7};
        System.out.println(has77(arr));

    }
    public static boolean has77(int[] arr){
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i]==7 && arr[i+1]==7){
                return true;
            }if (arr[i]==7 && arr[i+2]==7){
                return true;
            }
        }
        return false;
    }
}
