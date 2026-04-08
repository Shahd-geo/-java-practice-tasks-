public class TASK14 {
    static void main(String[] args) {
        int [] arr = {1,2,2,6,99,99,7};
        System.out.println(sum67(arr));

    }
    public static int  sum67(int[] arr){
        int sum = 0;
        boolean inSkip = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 6) {
                inSkip = true;
            }

            if (!inSkip) {
                sum += arr[i];
            }

            if (arr[i] == 7 && inSkip) {
                inSkip = false;
            }
        }

        return sum;
    }


}
