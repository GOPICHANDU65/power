package threads;

public class ThreadDemoTest {
    public static void main(String[] args) {
        Thread thread1= Thread.currentThread();
        Thread.currentThread().setName("chandu");
        String threadName= Thread.currentThread().getName();
        System.out.println(threadName);
        System.out.println(thread1.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread countThread = new NumberCountThread();
        countThread.setName("countThread-1");
        countThread.setPriority(1);
        countThread.start();
        Thread countThread2 = new NumberCountThread();
        countThread2.setName("countThread-2");
        countThread2.setPriority(5);
        countThread2.start();
        Thread countThread3 = new NumberCountThread();
        countThread3.setName("countThread-3");
        countThread3.setPriority(10);
        countThread3.start();

    }
}
