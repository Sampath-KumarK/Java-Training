
public class hi {

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = s.findMaxAverage(nums, k);

        System.out.println("Maximum Average: " + result);
    }
}

class Solution {

    public double findMaxAverage(int[] nums, int k) {

        double avg = 0;
        double ans = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            avg = avg + nums[i];
        }

        ans = avg;

        // Sliding window
        for (int i = 0; i < nums.length; i++) {

            if (i + k < nums.length) {

                avg = avg - nums[i];
                avg = avg + nums[i + k];

                if (avg > ans) {
                    ans = avg;
                    System.out.println("New max average found: " + ans);
                }

            }
        }
        

        return ans / k;
    }
}