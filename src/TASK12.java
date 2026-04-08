import java.util.Arrays;
public class TASK12 {
    static void main(String[] args) {
        int start = 4;
        int end = 20;
        System.out.println(Arrays.toString(fizzBuzz(start,end)));
}
public static String[] fizzBuzz (int start ,int end){
        String[] result = new String[end - start];
        for (int i = start; i <end; i++){
            int index = i - start;
            if (i % 3== 0 && i % 5 ==0){
                result[index]="FizzBuzz";
            }else if (i % 3 ==0){
                result[index]="Fizz";
            } else if (i % 5 ==0) {
                result[index]="Buzz ";


            }else  {    result[index] = String.valueOf(i);

        }

}
    return result;

        }
    }


