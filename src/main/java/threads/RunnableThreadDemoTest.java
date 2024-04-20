package threads;

public class RunnableThreadDemoTest {
    public static void main(String[] args) {
        Runnable numberCountRunnable = new NumberCountRunnableThread();
        Thread thread = new Thread(numberCountRunnable,"RunnableThread-1");
        thread.start();

    }
}
