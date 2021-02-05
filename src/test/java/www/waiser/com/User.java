package www.waiser.com;

import lombok.Data;

import java.security.PrivateKey;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/1/30
 */
@Data
public class User {
    private String name;
    private Integer age;
    private Integer salary;
    private List<String> skills;
    public User(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


}
