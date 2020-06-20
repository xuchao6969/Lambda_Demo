package code;

import util.JavaUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda1 {
    /*
    从"1" "2" "bilibili" "of" "codesheep" "5" "codesheep" "5" "at" "BILIBILI" "codesheep" "23" "CHEERS" "6"中
    找出所有 长度>=5的字符串，并且忽略大小写、去除重复字符串，然后按字母排序，最后用“ * ”连接成一个字符串输出
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("bilibili");
        list.add("of");
        list.add("codesheep");
        list.add("5");
        list.add("at");
        list.add("BILIBILI");
        list.add("codesheep");
        list.add("23");
        list.add("CHEERS");
        list.add("6");

        String str = list.stream()//list转为stream流
                .filter(i -> !JavaUtil.isNum(i))//过滤出不是数字的  也就是 得到字符  isNum是自己封装的方法
                .filter(i -> i.length()>5)//过滤出长度大于5的
                .map(i -> i.toLowerCase())//转为小写
                .distinct()//去重
                .sorted(Comparator.naturalOrder())//字符串排序
                .collect(Collectors.joining("*"));//字符串连接
        System.out.println(str);
    }


}
