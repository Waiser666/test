package www.waiser.com.lc2102.lc210206;

import org.junit.Test;

import java.util.Arrays;

/**
 * <p>
 * 1423. 可获得的最大点数
 * 几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。
 * <p>
 * 每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。
 * <p>
 * 你的点数就是你拿到手中的所有卡牌的点数之和。
 * <p>
 * 给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：cardPoints = [1,2,3,4,5,6,1], k = 3
 * 输出：12
 * 解释：第一次行动，不管拿哪张牌，你的点数总是 1 。但是，先拿最右边的卡牌将会最大化你的可获得点数。最优策略是拿右边的三张牌，最终点数为 1 + 6 + 5 = 12 。
 * 示例 2：
 * <p>
 * 输入：cardPoints = [2,2,2], k = 2
 * 输出：4
 * 解释：无论你拿起哪两张卡牌，可获得的点数总是 4 。
 * </p>
 *
 * @Author mengwei
 * @Date 2021/2/6
 */


public class LeetCode1423 {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        for (int i = 0;i<n-k;i++){
            sum += cardPoints[i];
        }
        int minSum = sum;
        for (int i = 0 ; i<k; i++){
            sum-=cardPoints[i];
            sum+=cardPoints[n-k+i];
            minSum = Math.min(minSum,sum);
        }
        return Arrays.stream(cardPoints).sum()-minSum;
    }
    @Test
    public void test(){
        int[] a = {100,40,17,9,73,75};
        int i = maxScore(a, 3);
        System.out.println(i);
    }
}
