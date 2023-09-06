class Solution {
    public int minimumMultiplications(int[] arr, int start, int end) {
        int mod = 100000;
        
        // Initialize an array to store the minimum steps required to reach each possible value.
        int[] dp = new int[mod];
        Arrays.fill(dp, Integer.MAX_VALUE); // Fill the array with maximum values.
        
        // Initialize a queue for BFS traversal.
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start); // Start from the given 'start' value.
        dp[start] = 0; // The number of steps required to reach 'start' is 0.
        
        // Start BFS traversal.
        while (!queue.isEmpty()) {
            int current = queue.poll(); // Get the current value from the queue.
            
            // Iterate through each factor in the 'arr' array.
            for (int factor : arr) {
                // Calculate the next value by multiplying 'current' with 'factor' and taking modulo 'mod'.
                long next = (long) current * factor % mod;
                
                // If the minimum steps to reach 'next' is still the maximum value (not visited yet),
                // update it to the steps required to reach 'current' + 1, and add 'next' to the queue for further exploration.
                if (dp[(int) next] == Integer.MAX_VALUE) {
                    dp[(int) next] = dp[current] + 1;
                    queue.offer((int) next);
                }
            }
        }
        
        // If 'end' is not reachable, dp[end] will still be the maximum value, so return -1.
        // Otherwise, return the minimum steps required to reach 'end'.
        return dp[end] == Integer.MAX_VALUE ? -1 : dp[end];
    }
}