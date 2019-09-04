package ThreadTest;

import java.util.concurrent.*;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-09-04 20:20
 **/
public class AccountWithoutSync {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor =  Executors.newCachedThreadPool();
        //创建并启动100个线程
        for(int i=0; i<100; i++){
            executor.execute(new AddAPennyTask());
        }
        executor.shutdown();

        while (!executor.isTerminated()){
            System.out.println("What is balance? " + account.getBalance());
        }
    }

    private static class AddAPennyTask implements Runnable{
        public void run(){
            account.deposit(1);
        }
    }

    private static class Account{
        private int balance =0;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount){
            int newBalance = balance + amount;

            try {
                Thread.sleep(5);
            }
            catch (InterruptedException ex){
            }
            balance = newBalance;
        }
    }
}
