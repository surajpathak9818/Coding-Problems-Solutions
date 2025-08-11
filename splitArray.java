

public class splitArray{
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        splitArray solution = new splitArray();
        int result = solution.splitArray(nums, m);
        System.out.println("The minimum largest sum is: " + result); // Expected output: 18
    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (canSplit(nums, m, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    // This helper method checks if the array can be split into 'm' pieces
    // where no piece has a sum greater than 'maxSum'.
    private boolean canSplit(int[] nums, int m, int maxSum) {
        int currentSum = 0;
        int pieces = 1;
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                currentSum = num;
                pieces++;
            } else {
                currentSum += num;
            }
        }
        return pieces <= m;
    }
}