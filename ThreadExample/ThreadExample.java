class MyRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
        System.out.println("child Thread");    
        }
    }
}

public class ThreadExample {
 
    public static void main(String[] arg){
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread");
        }
    }
}