package threads;

public class NumberCountThread extends Thread {
    public void run(){
        System.out.println(" from number count");
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+ " count "+ i+
                    " Thread priority" + Thread.currentThread().getPriority());
        }
    }

}
