public class TASK3 {
    static void main(String[] args) {
        System.out.println(lucky13(new int[]{1,4,5,6}));

    }
    public static boolean lucky13(int [] num){
        for (int i= 0 ; i < num.length ; i++){
            if (num[i]==1 || num[i]==3){
                return false;
            }
        }
        return true;
    }

}
