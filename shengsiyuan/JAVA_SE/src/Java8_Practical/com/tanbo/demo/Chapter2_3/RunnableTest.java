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
        //注意Runnable接口可以看做是什么也不接受，什么也不返回的接口
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2");
            }
        };

        process(r1);
        process(r2);
        process(() -> System.out.println("Hello world 3"));

        
    }

    public static void process(Runnable r){
        r.run();
    }
}
