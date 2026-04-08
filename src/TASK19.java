public class TASK19 {
    static void main(String[] args) {
        int[] arr = {3,3,5};
        System.out.println(haveThree(arr));


    }
    public static boolean  haveThree( int[] arr){
        int count = 0;
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i] ==3){
                count++;

            }if (i< arr.length -1 && arr[i+1]==3){
                return false;

            }
        }
        return true;
    }
}
