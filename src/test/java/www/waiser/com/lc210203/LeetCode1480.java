package www.waiser.com.lc210203;

/**
 * <p>
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * <p>
 * 请返回 nums 的动态和。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 * 示例 2：
 * <p>
 * 输入：nums = [1,1,1,1,1]
 * 输出：[1,2,3,4,5]
 * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 * 示例 3：
 * <p>
 * 输入：nums = [3,1,2,10,1]
 * 输出：[3,4,6,16,17]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/2/3
 */
public class LeetCode1480 {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int tep = nums [0];
        for (int i = 0; i < result.length; i++) {
            result [i] = tep;
            if (i!= nums.length-1){
                tep+=nums[i+1];
            }

        }
        return result;

    }



}



