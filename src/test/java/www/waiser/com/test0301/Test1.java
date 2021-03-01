package www.waiser.com.test0301;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/1/5
 */
public class Test1 {

        public static void main(String[] args) {
            List<Person> personList = new ArrayList<Person>();
            personList.add(new Person("Tom", 8900, 23, "male", "New York"));
            personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
            personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
            personList.add(new Person("Anni", 8200, 24, "female", "New York"));
            personList.add(new Person("Owen", 9500, 25, "male", "New York"));
            personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
            System.out.println(personList);
            List<String> fiterList = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName)
                    .collect(Collectors.toList());
            System.out.print("高于8000的员工姓名：" + fiterList);
        }
    }
class Person {
    private String name;  // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area;  // 地区

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // 构造方法
    public Person(String name, int salary, int age,String sex,String area) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.area = area;
    }
    // 省略了get和set，请自行添加

}

