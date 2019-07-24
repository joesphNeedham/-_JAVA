package ReflectTest;

import java.lang.reflect.Method;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-07-24 13:02
 **/
public class InvokeTester{
    public int add(int param1, int param2){
        return param1 + param2;
    }

    public String echo(String message){
        return "hello:" + message;
    }

    public static void main(String[] args) throws Exception {
        Class<?> classType = InvokeTester.class;
        Object invokeTester = classType.newInstance();
        System.out.println(invokeTester instanceof InvokeTester);
        //通过反射来调用方法,第一个参数是想使用的方法名字，第二个参数是所想使用的方法的参数所构成的class数组
        // 有第二个参数的原因是java中存在着重载的问题，单独从方法名字，无法获取到用的是哪个方法
        Method addMethod = classType.getMethod("add",int.class, int.class);
        Object result = addMethod.invoke(invokeTester,1,3);
        System.out.println(result);
    }
}
