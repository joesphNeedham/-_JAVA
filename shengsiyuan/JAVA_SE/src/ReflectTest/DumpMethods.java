package ReflectTest;

import java.lang.reflect.Method;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-07-24 12:49
 **/
public class DumpMethods {
    public static void main(String[] args) throws Exception{
        //获得了java.lang.String 这个字符串所标识的Class对象
        Class<?> classType = Class.forName("java.lang.String");

        Method[] methods = classType.getDeclaredMethods();
        for (Method s:methods){
            System.out.println(s);
        }
    }
}
