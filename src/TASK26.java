public class TASK26 {
    static void main(String[] args) {
        int[] num = {1,2,1,4,6,4,4};
            System.out.println(more14(num));

    }
    public static boolean more14(int[] num){
        int count1=num[0];
        int count4 = num[0];
        for (int i = 0 ; i<num.length-1;i++){
            if (num[i]==1){
                count1++;

            }
            if (num[i]==4){
                count4++;
            }
        }
        if (count1>count4){
            return true;
        }
        return false;
    }
}
