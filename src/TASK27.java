import java.util.Arrays;
public class TASK27 {
    static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(fizzArray2(n)));

    }
    public static String[] fizzArray2(int n){
        String[] result = new String[n];
        for (int i = 0 ; i <n ; i++){
            result[i] = String.valueOf(i);
        }
        return result;
    }
}
