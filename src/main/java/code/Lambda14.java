package code;

import java.util.function.Consumer;

public class Lambda14 {
    public static void main(String[] args) {
        /**
         * 接口：Consumer 顾名思义，它是“消费者的含义”，接受参数而不返回值
         * 示例：打印消息
         * 结果：hello world
         *       hello java
         *       hhhhh
         *       hhhhh
         *       hhhhh
         */
        Consumer c = System.out::println;
        c.accept("hello world");//打印hello world
        c.accept("hello java");//打印hello java
        c.andThen(c).andThen(c).accept("hhhhh");//连续打印三次hhhhh  而不是hello java hello java hhhhh
    }
}
