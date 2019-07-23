package InnerClass;

import javax.swing.*;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-07-23 12:47
 **/

class MemberInner
{
    private int b =4;
    public class Inner2
    {
        private int a =5;
        public void doSomething()
        {
            System.out.println(MemberInner.this.b);
        }
    }

    public void method()
    {
        Inner2 inner2 = this.new Inner2();

    }
}
public class MemberInnerClassTest {
    public static void main(String[] args) {
        MemberInner.Inner2 inner2 = new MemberInner().new Inner2();
        inner2.doSomething();
    }
}
