package code;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda5 {
    public static void main(String[] args) {
        /**
         * 常用的流：map
         * 功能：转换功能，内部就是Function接口。惰性求值
         * 示例：获取所有同学的名字
         * 结果：[路飞, 红发, 白胡子]
         */
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));
        List<String> names = students.stream().map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
