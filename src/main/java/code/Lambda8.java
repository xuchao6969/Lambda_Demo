import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Lambda8 {
    /**
     * 常用的流：count
     * 功能：统计功能，一般都是结合filter使用，因为先筛选出我们需要的再统计即可。及早求值
     * 示例：统计年龄小于45的人数
     * 结果：年龄小于45岁的人数是：2
     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));
        long count = students.stream().filter(s1 -> s1.getAge() < 45).count();
        System.out.println("年龄小于45岁的人数是：" + count);
    }
}
