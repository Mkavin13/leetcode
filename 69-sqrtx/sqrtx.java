class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        // For x > 0, the smallest possible square root is 1.
        // Initialize 'low' to 1 to prevent 'mid' from becoming 0
        // which would cause an ArithmeticException during x/mid.
        int low = 1; 
        int high = x;
        int ans = 1; // Initialize ans to 1 for x >= 1, it will store the floor of sqrt(x).

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid < mid) { 
                high = mid - 1;
            } else { 
                ans = mid; 
                low = mid + 1;
            }
        }
        return ans;
    }
}