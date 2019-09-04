package ThreadTest;


/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-09-04 14:59
 **/
import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        //创建了最大为3的固定线程池
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //将可执行的任务，提交给executor;
        executor.execute(new PrintChar('a',100));
        executor.execute(new PrintChar('b',100));
        executor.execute(new PrintNum(100));
        //shutdown
    }
}
