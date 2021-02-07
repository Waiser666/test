package www.waiser.com.lc2102.lc210206;

/**
 * <p>
 *剑指 Offer 42. 连续子数组的最大和
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 *输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * </p>
 *
 * @Author mengwei
 * @Date 2021/2/6
 */
public class JZOffer42 {
        //dp 题 核心思路就是 建立dp 数组 ，计算以dp[i] 就是以nums[i]结尾的最大子串的和
        public int maxSubArray(int[] nums){
            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                    nums[i]+=Math.max(nums[i-1],0);
                    res=Math.max(res,nums[i]);// 此处不能用nums[i-1] 原数组已被改变
            }
            return res;


        }

}
