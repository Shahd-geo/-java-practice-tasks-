public class TASK8 {
    static void main() {
        int[] arr = {1,2,3,1,2,3};
        System.out.println(sameEnds(arr,3));


    }
    public static boolean sameEnds (int[] arr , int n){
        for (int i =0 ; i< n; i++){
            if (arr[i] != arr[arr.length -n +i]){
                return false;

            }
        }
        return true;
    }
}
