package code;

import entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda6 {
    public static void main(String[] args) {
        /**
         * 常用的流：flatMap
         * 功能：将多个Stream合并为一个Stream。惰性求值
         * 示例：调用Stream.of的静态方法将两个list转换为Stream，再通过flatMap将两个流合并为一个
         * 结果：[
         *       Student(name=路飞, age=22, length=175, specialisies=null),
         *       Student(name=红发, age=40, length=180, specialisies=null),
         *       Student(name=白胡子, age=50, length=185, specialisies=null),
         *       Student(name=艾斯, age=25, length=183, specialisies=null),
         *       Student(name=雷利, age=48, length=176, specialisies=null)
         *     ]
         */
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));
        List<Student> studentList = Stream.of(students,
                Arrays.asList(new Student("艾斯", 25, 183),
                        new Student("雷利", 48, 176)))
                .flatMap(students1 -> students1.stream()).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
