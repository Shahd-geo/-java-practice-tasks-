public class TASK15 {
    static void main(String[] args) {
        int[] arr = {1,2,5,3};
        System.out.println(sum28 (arr));

    }
    public static boolean sum28(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i]==2){
                sum++;
            }
        }if (sum== 8){
            return true;
        }else { return false;
        }
    }

}
