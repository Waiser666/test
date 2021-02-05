package www.waiser.com.lc210204;

/**
 * <p>
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/2/4
 */
public class JZOffer58 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();
    }
}
