public class dynamic {
    public static void main(String[] args) {
        int n = 18;
        int[] arr = {1, 5, 7};
        int ans = coinChange(n, arr);
        System.out.println(ans);
    }

    static int coinChange(int n, int[] arr) {
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (n - arr[i] >= 0) {
                int subAns = coinChange(n - arr[i], arr);
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }


            }

        }
        return ans;

    }
}
