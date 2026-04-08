
public class TASK5 {
    static void main(String[] args) {
        System.out.println(no14(new int[]{1, 7, 8, 9}));
        System.out.println(no14(new int[]{1, 4, 8, 9}));

    }

    public static boolean no14(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                for (int s = 0; s < arr.length; s++) {
                    if (arr[s] == 4) {
                        return false;
                    }
                }

            }

        } return true;
    }
}
