package code;

import entity.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda3 {

    public static void main(String[] args) {
        /**
         * 惰性求值：只描述Stream，操作的结果也是Stream，这样的操作称为惰性求值。惰性求值可以像建造者模式一样链式使用，最后再使用及早求值得到最终结果。
         * 及早求值：得到最终的结果而不是Stream，这样的操作称为及早求值。
         *
         * 常用的流：collect(Collectors.toList())
         * 功能：将流转为list
         * 结果：[Student(name=路飞, age=22, length=175, specialisies=null), Student(name=红发, age=40, length=180, specialisies=null)]
         */
        List<Student> studentList = Stream.of(
                new Student("路飞", 22, 175),
                new Student("红发", 40, 180)
                ).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
