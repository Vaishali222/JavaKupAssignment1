package AdvancedJava.Q3;



public class ThreadAndRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Interface");
//            using sleep method
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ThreadAndRunnable usingRunnable=new ThreadAndRunnable();
        Thread thread =new Thread(usingRunnable);

        Runnable thread2 = ()->{
            for (int i=0; i<5;i++){
                System.out.println("Using lambda");
            }
        };
        thread.start();
        thread2.run();
        //    Using Thread class
        UsingThread thread3 = new UsingThread();
        thread3.start();
    }
}
class UsingThread extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread Class");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
