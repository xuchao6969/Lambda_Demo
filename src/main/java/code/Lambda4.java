package code;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda4 {
    public static void main(String[] args) {
        /**
         * 常用的流：filter
         * 功能：顾名思义，起过滤筛选的作用。内部就是Predicate接口。惰性求值。
         * 结果：[Student(name=路飞, age=22, length=175, specialisies=null)]
         */
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));
        List<Student> list = students.stream()
                .filter(stu -> stu.getLength() < 180)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
