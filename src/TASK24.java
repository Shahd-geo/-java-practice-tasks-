public class TASK24 {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,100};
        System.out.println(centeredAverage(arr));

    }
    public static int  centeredAverage(int[] arr){
        int max = arr [0];
        int min=arr[0];
        int sum = 0;
        for (int i =0 ; i < arr.length; i++){
            sum+=arr[i];
            if (arr[i] < min) {

                min= arr[i];
            }
            if (arr[i] > max){
                max=arr[i];
            }
        }
        sum = sum - min - max;
        return sum;
    }

}
