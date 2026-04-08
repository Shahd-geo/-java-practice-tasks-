public class TASK1 {
    static void main(String[] args) {
        System.out.println(countEvens(new int[] {2, 1, 2, 3, 4}));

    }

    public static int countEvens(int[] n) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

