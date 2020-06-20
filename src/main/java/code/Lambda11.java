package code;

import entity.SpecialityEnum;
import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lambda11 {
    public static void main(String[] args) {
        /**
         * 常用的流：Predicate
         * 功能：将流分解成两个集合，接收一个Predicate函数式接口。
         * 示例：按照会sing的和不会sing对学生进行分拆
         * 结果：{
         *        false=[Student(name=红发, age=40, length=180, specialisies=swimming), Student(name=白胡子, age=50, length=185, specialisies=dance)],
         *        true=[Student(name=路飞, age=23, length=175, specialisies=sing)]
         *       }
         * 和Collectors.groupingBy() 分组类似
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
        Map<Boolean, List<Student>> listMap = students.stream().collect(
                Collectors.partitioningBy(stu ->
                        stu.getSpecialisies().
                                contains(SpecialityEnum.SING.name)));
        System.out.println(listMap);

        //使用Collectors.groupingBy()也可完成同样的功能
        Map<Boolean, List<Student>> li = students.stream().collect(Collectors.groupingBy(student -> student.getSpecialisies().contains(SpecialityEnum.SING.name)));
        System.out.println(li);
    }
}
