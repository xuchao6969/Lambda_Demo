package code;

import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda15 {
    public static void main(String[] args) {
        /**
         * 接口：Function 代表的含义是“函数”，其实和上面的 Consumer有点像，不过 Function既有输入，也有输出，使用更加灵活
         * 示例：对一个整数先乘以 2，再计算平方值
         * 结果：36  5184
         * 过程：先走apply传递参数3 然后执行f1=3*2得到6 然后执行f2=6*6得到36
         *       先走apply传递参数3 然后执行f1=3*2得到6 然后执行f2=6*6得到36 然后执行f1=36*2得到72 然后执行f2=72*72得到5184
         * andThen的参数就是 Function类型的after 即接下里执行的函数
         */
        Function<Integer,Integer> f1 = i -> i*2;
        Function<Integer,Integer> f2 = i -> i*i;
        Consumer c = System.out::println;

        c.accept(f1.andThen(f2).apply(3));
        c.accept(f1.andThen(f2).andThen(f1).andThen(f2).apply(3));
    }
}
