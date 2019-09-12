package ThreadTest;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-09-05 10:29
 **/
public class AccountWithLocj {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor =  Executors.newCachedThreadPool();
        //创建并启动100个线程
        for(int i=0; i<100; i++){
            executor.execute(new AddAPennyTask());
        }
        executor.shutdown();

        while (!executor.isTerminated()){
        }
        System.out.println("What is balance? " + account.getBalance());
    }

    private static class AddAPennyTask implements Runnable{
        public void run(){
            account.deposit(1);
        }
    }

    //An inner class for Account
    public static class Account{
        private static Lock lock = new ReentrantLock();//创建一个lock
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amout){
            lock.lock(); //获取锁

            try {
                int newBalance = balance + amout;

                Thread.sleep(5);
                balance = newBalance;
            }
            catch (InterruptedException ex){

            }
            finally {
                lock.unlock(); //释放锁
            }
        }
    }
}
