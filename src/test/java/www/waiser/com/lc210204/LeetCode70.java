package www.waiser.com.lc210204;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;
import org.junit.Test;

/**
 * <p>
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/2/4
 */
public class LeetCode70 {
    @Test
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2, temp;
        for (int i = 3; i <= n; i++) {
            temp = a;
            a = b;
            b = temp + b;
        }
        return b;


    }
}
