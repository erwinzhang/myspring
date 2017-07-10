package aspectj;

/**
 * Created by erzhang on 7/7/17.
 */
public class MyThread extends Thread {

    private int count = 5;
//    public MyThread(String name){
//        this.setName(name);
//    }

    @Override
    public void run(){
        super.run();
        count --;
        System.out.println("Thread: " + this.currentThread().getName() + "| " + "count: " + count);
    }
}
