package entity;

import lombok.Data;

/**
 * 学生
 */
@Data
public class Student {
    private String name;
    private Integer age;
    private Integer length;
    private String specialisies;
    private Subject subject;

    public Student(String name, Integer age, Integer length){
        this.name = name;
        this.age = age;
        this.length = length;

    }
}
