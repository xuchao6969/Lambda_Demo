package entity;

/**
 * 特长
 */
public enum SpecialityEnum {

    SING("sing"),
    DANCE("dance"),
    SWIMMING("swimming"),
    RUNNING("running"),
    UNDEFINED("");               	//未定义

    public String name;

    SpecialityEnum(String name){
        this.name = name;
    }

    public static SpecialityEnum getSpecialist(String name){
        for(SpecialityEnum item: values()){
            if(name.equals(item.name)){
                return item;
            }
        }
        return UNDEFINED;
    }
}
