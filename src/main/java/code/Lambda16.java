package code;

import entity.Student;
import entity.Subject;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Lambda16 {


    /**
     * 接口：Optional 本质是个容器，你可以将你的变量交由它进行封装，这样我们就不用显式对原变量进行 null值检测，防止出现各种空指针异常
     * 示例：获取学生科目的成绩
     */
    public static Integer getScoreLambda(Student stu){
        return Optional.ofNullable(stu).map(Student::getSubject).map(Subject::getScore).orElse(null);
    }
    //常规做法 判断学生是否为空，不为空得到学科，判断学科是否为空，不为空取值 如果有很多层包着 简直是俄罗斯套娃 惨不忍睹
    public static Integer getScoreNormal(Student stu){
        if(stu != null){
            Subject sub = stu.getSubject();
            if (sub != null){
                return sub.getScore();
            }
        }
        return null;
    }
}
