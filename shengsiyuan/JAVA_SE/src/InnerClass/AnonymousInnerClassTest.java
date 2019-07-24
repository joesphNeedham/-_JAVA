package InnerClass;

import java.util.Date;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-07-23 13:35
 **/
public class AnonymousInnerClassTest {
    @SuppressWarnings("deprecation")
    public String get(Date date){
        return date.toLocaleString();
    }

    public static void main(String[] args) {
        AnonymousInnerClassTest anonymousInnerClassTest = new AnonymousInnerClassTest();
        String str = anonymousInnerClassTest.get(new Date());
        System.out.println(str);

        String str1 = anonymousInnerClassTest.get(new Date() {
            public String toLocaleString(){
                return "hello world";
            }
        });
        System.out.println(str1);
    }
}
