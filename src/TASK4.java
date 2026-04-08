import java.lang.reflect.Array;
import java.util.Arrays;

public class TASK4 {
    static void main(String[] args) {
        System.out.println(Arrays.toString (fizzArray(5)));

    }
    public static int []  fizzArray( int n){
        int [] result = new int[n];
        for (int i = 0 ; i < n ; i++){
            result[i]=i;
        }
        return result;

    }
}
