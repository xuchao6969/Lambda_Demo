package entity;

import lombok.Data;

import java.util.List;

/**
 * 班级
 */
@Data
public class OutstandingClass {
    private String name;
    private List<Student> students;

    public OutstandingClass(String name, List<Student> students){
        this.name = name;
        this.students = students;
    }

    public OutstandingClass(){
       new OutstandingClass();
    }
}
