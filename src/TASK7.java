public class TASK7 {
    static void main(String[] args) {
        System.out.println(modThree(new int[]{2,4,6,1,3}));

    }
    public static boolean modThree(int[] arr){
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] % 2 ==0  && arr[i+1] % 2 == 0 && arr[i+2] %2==0 ){
                return true;
            }
            if (arr[i] % 2 !=0 && arr[i+1] % 2 != 0 && arr[i+2] %2!=0 ){
                return true;
            }
        }
        return false;
    }
}
