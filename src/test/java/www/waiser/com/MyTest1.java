package www.waiser.com;


import com.alibaba.druid.util.StringUtils;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/1/22
 */
public class MyTest1 {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(11.2);
        doubles.add(22.2);
        doubles.add(23.2);

        System.out.println(doubles.stream().mapToDouble(Double::doubleValue).sum());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(12);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        User temmo = new User("temmo", 12, 3000);
        User ez = new User("ez", 12, 13000);
        User ashe = new User("ashe", 12, 5000);
        User ashec = new User("ashe", 12, 5000);
        ArrayList<User> heroes = new ArrayList<>();
        heroes.add(temmo);
        heroes.add(ez);
        heroes.add(ashe);
        heroes.add(ashec);
        User ashe1 = new User("ashe", 13, 5000);
        heroes.add(ashe1);
        List<User> salaryFilter = heroes.stream().filter(User -> User.getSalary() > 1000).
                collect(Collectors.toList());
        List<String> collect = salaryFilter.stream().map(User::getName).collect(Collectors.toList());

        System.out.println("薪水大于1000的英雄："+collect);
        boolean b = heroes.stream().allMatch(User -> User.getSalary() > 1000);
        System.out.println("所有英雄薪资"+ ((b==true)?"都":"不都")+"大于1000");
        List<String> collect1 = heroes.stream().distinct().map(User::getName).collect(Collectors.toList());
        System.out.println("英雄去重："+collect1);
        List<Map> collect2 = heroes.stream().map(User -> {
            Map map = new HashMap();
            map.put("name", User.getName());
            map.put("age", User.getAge());
            return map;
        }).collect(Collectors.toList());
        System.out.println(collect2);

        ArrayList<Double> doubles1 = new ArrayList<>();

        System.out.println("这是版本3");


        int s = 1;

    }

    @Test
    public void myTest(){
        User ez = new User("ez", 12, 13000);
        List<String> skills = ez.getSkills();
        skills.add("123");
        if (skills!=null&&skills.size()>0){
            System.out.println("listbu为空");
        }

    }
}
