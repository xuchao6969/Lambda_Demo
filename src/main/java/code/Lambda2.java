package code;

import entity.Student;

import javax.swing.text.html.parser.Entity;
import java.math.BigDecimal;
import java.util.function.*;

public class Lambda2 {
    public static void main(String[] args) {
        /**
         * 函数接口：Predict
         * 抽象方法：test(T t)
         * 参数：T
         * 返回值类型：Boolean
         * 功能：判断真假
         * 示例：判断学生身高
         * 结果：韩非的身高高于185吗?: false
         */
        Predicate<Integer> predicate = x -> x > 185;
        Student student = new Student("韩非", 23, 175);
        System.out.println("韩非的身高高于185吗?: " + predicate.test(student.getLength()));

        /**
         * 函数接口：Consumer
         * 抽象方法：accept(T t)
         * 参数：T
         * 返回值类型：void
         * 功能：消费消息
         * 示例：输出值
         * 结果：列东方位 青龙
         */
        Consumer<String> consumer = System.out::println;
        consumer.accept("列东方位 青龙");

        /**
         * 函数接口：Function
         * 抽象方法：R apply(T t)
         * 参数：T
         * 返回值类型：R
         * 功能：将T映射为R（转换功能）
         * 示例：输出student名字
         * 结果：韩非
         */
        Function<Student, String> function = Student::getName;
        String name = function.apply(student);
        System.out.println(name);

        /**
         * 函数接口：Supplier
         * 抽象方法：T get()
         * 参数：void
         * 返回值类型：T
         * 功能：生产消息
         * 示例：工厂方法
         * 结果：10
         */
        Supplier<Integer> supplier = () -> Integer.valueOf(BigDecimal.TEN.toString());
        System.out.println(supplier.get());

        /**
         * 函数接口：UnaryOperator
         * 抽象方法：T apply(T t)
         * 参数：T
         * 返回值类型：T
         * 功能：一元操作
         * 示例：逻辑非(!)
         * 结果：false
         */
        UnaryOperator<Boolean> unaryOperator = uglily -> !uglily;
        Boolean apply2 = unaryOperator.apply(true);
        System.out.println(apply2);
        //使用BinaryOperator函数式接口  抽象方法T apply(T t, U u) 功能：二元操作 参数T,U 返回值类型T  求两个数乘积

        /**
         * 函数接口：BinaryOperator
         * 抽象方法：T apply(T t, U u)
         * 参数：T,U
         * 返回值类型：T
         * 功能：二元操作
         * 示例：求两个数乘积
         * 结果： 6
         */
        BinaryOperator<Integer> operator = (x, y) -> x * y;
        Integer integer = operator.apply(2, 3);
        System.out.println(integer);

        /**
         * 演示函数式接口
         * 结果：我是一个演示的函数式接口
         */
        test(() -> "我是一个演示的函数式接口");
    }
    /**
     * 演示自定义函数式接口使用
     *
     * @param worker
     */
    public static void test(Worker worker) {
        String work = worker.work();
        System.out.println(work);
    }
    public interface Worker {
        String work();
    }
}
