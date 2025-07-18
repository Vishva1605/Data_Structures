import java.util.Arrays;

public class ArrayListConsucutiveCount {
    public static void main(String[] args){
        int[] nums = {0,2,1,3,4,6,8,7,0,0,-1};
        System.out.println(Solution.longestConsecutive(nums));
    }
    class Solution {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            } else if(nums[i] == nums[i-1] + 1) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
}
