public class TASK28 {
    static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 6, 7};
        System.out.println(either24(arr));


    }

    public static boolean either24(int[] arr) {
        boolean has22 = false;
        boolean has44 = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 2) {
                has22 = true;
            }
            if (arr[i] == 4 && arr[i + 1] == 4) {
                has44 = true;
            }
        }
        return has22 ^ has44;
    }
}


