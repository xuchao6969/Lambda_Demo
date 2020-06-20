package code;

import entity.SpecialityEnum;
import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lambda12 {

    public static void main(String[] args) {
        /**
         * 常用的流：数据分组groupingBy  分组条件通常会被作为Map的key
         * 功能：数据分组是一种更自然的分割数据操作，与将数据分成 ture 和 false 两部分不同，可以使用任意值对数据分组。Collectors.groupingBy接收一个Function做转换。
         * 示例：按照会特长对学生进行分组
         * 结果：{
         *        swimming=[Student(name=红发, age=40, length=180, specialisies=swimming)],
         *        sing=[Student(name=路飞, age=23, length=175, specialisies=sing)],
         *        dance=[Student(name=白胡子, age=50, length=185, specialisies=dance)]
         *       }
         * 分组条件可以拼接多个 但是要和声明的类型(Map的key)一致
         * 示例：声明类型是String
         * 分组条件：特长***名字  stu.getSpecialisies()+"***"+stu.getName()
         * 结果：{
         *        dance***白胡子=[Student(name=白胡子, age=50, length=185, specialisies=dance)],
         *        sing***路飞=[Student(name=路飞, age=23, length=175, specialisies=sing)],
         *        swimming***红发=[Student(name=红发, age=40, length=180, specialisies=swimming)]
         *       }
         */
        List<Student> students = new ArrayList<>(3);
        Student stu1 = new Student("路飞", 23, 175);
        stu1.setSpecialisies("sing");
        students.add(stu1);
        Student stu2 = new Student("红发", 40, 180);
        stu2.setSpecialisies("swimming");
        students.add(stu2);
        Student stu3 = new Student("白胡子", 50, 185);
        stu3.setSpecialisies("dance");
        students.add(stu3);
        Map<String, List<Student>> listMap =
                students.stream().collect(
                        Collectors.groupingBy(stu -> stu.getSpecialisies()));
        System.out.println(listMap);
        Map<String, List<Student>> lis =
                students.stream().collect(
                        Collectors.groupingBy(stu -> stu.getSpecialisies()+"***"+stu.getName()));
        System.out.println(lis);

    }
}
