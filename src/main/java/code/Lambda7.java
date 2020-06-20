package code;

import entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda7 {
    public static void main(String[] args) {
        /**
         * 常用的流：max min
         * 功能：我们经常会在集合中求最大或最小值，使用流就很方便。及早求值。
         * 示例：得到年龄最大和最小的同学
         * 结果：Student(name=白胡子, age=50, length=185, specialisies=null)
         *       Student(name=路飞, age=22, length=175, specialisies=null)
         *
         * 补充：max、min接收一个Comparator（例子中使用java8自带的静态函数，只需要传进需要比较值即可。）
         * 并且返回一个Optional对象，该对象是java8新增的类，专门为了防止null引发的空指针异常。可以使用max.isPresent()判断是否有值；
         * 可以使用max.orElse(new Student())，当值为null时就使用给定值；也可以使用max.orElseGet(() -> new Student());
         * 这需要传入一个Supplier的lambda表达式。
         */
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));
        Optional<Student> max = students.stream()
                .max(Comparator.comparing(stu -> stu.getAge()));
        Optional<Student> min = students.stream()
                .min(Comparator.comparing(stu -> stu.getAge()));
        //判断是否有值
        if (max.isPresent()) {
            System.out.println(max.get());
        }
        if (min.isPresent()) {
            System.out.println(min.get());
        }
    }
}
