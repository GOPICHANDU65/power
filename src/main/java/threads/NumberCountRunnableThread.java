package threads;

public class NumberCountRunnableThread implements Runnable{

    public void run(){
        System.out.println(" From Number Count Runable Thread");
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+ " count "+ i+
                    " Thread priority" + Thread.currentThread().getPriority());
        }
    }

}
