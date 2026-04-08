public class TASK2 {
    static void main(String[] args) {
        System.out.println(sum13(new Integer[]{1,2,13,2,1}));

    }
    public static int sum13(Integer [] n){
        int sum = 0;
        for (int i =0 ; i< n.length;i++){
            if (n[i]==13){
                i++;
            }else {
                sum+= n[i];
            }
        }return sum;
    }
}
