public class TASK17 {
    static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int n = 3;
        System.out.println(isEverywhere(arr,n));
    }
    public static boolean isEverywhere(int[]arr,int n){
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i] ==n){
                return true;
            }
        }
        return false;

    }

}
