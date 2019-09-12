package Java8_Practical.com.tanbo.demo.Chapter2_3;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-09-12 16:55
 **/
public class RunnableTest {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello word 1");

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2");
            }
        };

        
    }

    public static void process(Runnable r){
        r.run();
    }
}
