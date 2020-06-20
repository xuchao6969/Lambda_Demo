package util;

/**
 *
 */
public class JavaUtil {

    /**
     * 字符串是不是数字
     * @param str
     * @return
     */
    public static Boolean isNum(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return  true;
    }

}
