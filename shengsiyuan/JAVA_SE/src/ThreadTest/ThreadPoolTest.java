package ThreadTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-08-14 15:55
 **/
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10,
                200, TimeUnit.MICROSECONDS, new ArrayBlockingQueue<Runnable>(5));

        for (int i=0;i<15;i++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目：" + executor.getPoolSize()+"，队列中等待执行的任务数目："+executor.getQueue().size());

        }
        executor.shutdown();

    }

}

class MyTask implements Runnable{
    private int taskNum;

    public MyTask(int num){
        this.taskNum = num;
    }

    @Override
    public void run(){
        System.out.println(String.format("正在执行task %d" , taskNum));
        try {
            Thread.currentThread().sleep(4000);

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("task "+ taskNum+ "执行完毕");
    }
}
