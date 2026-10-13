class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // 1. Calculate the sum of the first window
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }

        if (k == arr.length) return max_sum;

        int current_window_sum = max_sum;
        int start = 1;
        int last = k;

        while (last < arr.length) {
            current_window_sum = current_window_sum - arr[start - 1] + arr[last];

            max_sum = (current_window_sum > max_sum) ? current_window_sum : max_sum;

            last++;
            start++;
        }

        return max_sum;
    }
}
