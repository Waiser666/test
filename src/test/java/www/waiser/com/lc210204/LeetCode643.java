package www.waiser.com.lc210204;

import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.Max;

/**
 * <p>
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * <p>
 * 示例：
 * <p>
 * 输入：[1,12,-5,-6,50,3], k = 4
 * 输出：12.75
 * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 *
 * @Author mengwei
 * @Date 2021/2/4
 */

public class LeetCode643 {
    @Test
    public double findMaxAverage(int[] nums, int k) {
        double result = 0;
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            //sum = sum +nums[k]-nums[i-k];
            sum = sum +nums[i]-nums[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        result = maxSum / k;

            return result;
    }

}
