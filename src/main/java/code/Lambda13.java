package code;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda13 {
    public static void main(String[] args) {

        /**
         * 常用的流：拼接joining 有三个参数，第一个是分隔符，第二个是前缀符，第三个是后缀符。也可以不传入参数Collectors.joining()，这样就是直接拼接。
         * 功能：类似stringbuilder这样循环append("a") append("b") append("c")拼接
         * 示例：将所有学生的名字拼接起来
         * 结果：[路飞,红发,白胡子]
         */
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));

        String names = students.stream()
                .map(Student::getName).collect(Collectors.joining(",","[","]"));
        System.out.println(names);

    }
}
