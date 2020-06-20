package code;

import entity.OutstandingClass;
import entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda10 {
    /**
     * 收集器，一种通用的、从流生成复杂值的结构。只要将它传给 collect 方法，所有
     * 的流就都可以使用它了。标准类库已经提供了一些有用的收集器，以下示例代码中的收集器都是从 java.util.stream.Collectors 类中静态导入的。
     *
     *
     * 结果：人数最多的班级是：一班  一班平均年龄是：37.666666666666664
     */
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>(3);
        students1.add(new Student("路飞", 23, 175));
        students1.add(new Student("红发", 40, 180));
        students1.add(new Student("白胡子", 50, 185));
        OutstandingClass ostClass1 = new OutstandingClass("一班", students1);
        //复制students1，并移除一个学生
        List<Student> students2 = new ArrayList<>(students1);
        students2.remove(1);
        OutstandingClass ostClass2 = new OutstandingClass("二班", students2);
        //将ostClass1、ostClass2转换为Stream
        Stream<OutstandingClass> classStream = Stream.of(ostClass1, ostClass2);
        OutstandingClass outstandingClass = biggestGroup(classStream);
        System.out.println("人数最多的班级是：" + outstandingClass.getName());
        System.out.println("一班平均年龄是：" + averageNumberOfStudent(students1));
    }

    /**
     * 获取人数最多的班级
     * 无论选择哪种返回值语句都可以
     * 区别是 Optional中对null做了许多封装，可以进行空值的校验
     * orElseGet方法 如果创建的Optional中有值存在，则返回此值，否则返回一个由Supplier接口生成的值
     */
    private static OutstandingClass biggestGroup(Stream<OutstandingClass> outstandingClasses) {
//        return outstandingClasses.max(Comparator.comparing(stu -> stu.getStudents().size())).get();
        return Optional.of(outstandingClasses.max(Comparator.comparing(stu -> stu.getStudents().size())).get()).orElseGet(OutstandingClass:: new );
    }
    /**
     * 计算平均年龄
     */
    private static double averageNumberOfStudent(List<Student> students) {
       return students.stream().collect(Collectors.averagingInt(Student::getAge));
    }


}
