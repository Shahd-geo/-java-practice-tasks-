public class TASK13 {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println( bigDiff(arr));

    }
    public static int  bigDiff(int [] arr){
        int max = arr[0];
        int min = arr[0];
        int result = 0;
        for(int n :arr ) {
            if (n > max) {
                max = n;
            } else if (n < min) {
                min=n;

            }result= max-min;
        }return result;
    }
}
