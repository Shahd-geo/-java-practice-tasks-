public class TASK25 {
    static void main(String[] args) {
        int[]arr={1,3,2,2,6};
        System.out.println(has22(arr));


    }
    public static boolean has22(int[] arr){
        for (int i = 0 ; i< arr.length;i++){
            if (arr[i]==2 && arr[i+1]==2){
                return true;
            }
        }
        return false;
    }

}
