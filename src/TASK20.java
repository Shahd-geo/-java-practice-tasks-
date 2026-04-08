public class TASK20 {
    static void main(String[] args) {
        int [] arr={23,24,25};
        System.out.println(tripleUp(arr));

    }
    public static boolean tripleUp(int[] arr){
        for (int i=0 ; i< arr.length ;i++){
            if (arr[i+1] == arr[i]+1){
                if (arr[i +2]== arr[i]+2){
                    return true;
                }
            }
        }
        return false;
    }
}
