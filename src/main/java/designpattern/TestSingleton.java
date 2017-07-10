package designpattern;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by erzhang on 6/13/17.
 */
public class TestSingleton {

    boolean lock;
    public boolean isLock(){
        return lock;
    }

    public void setLock(boolean lock){
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException{
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
//        final TestSingleton lock = new TestSingleton();
//        lock.setLock(true);
        final CountDownLatch cd = new CountDownLatch(1);

        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 2000; i++){
            System.out.println("----Start----" + i);
            executorService.execute(new Runnable() {
                @Override
                public void run() {
//                    while(true){
//                        boolean flag = !lock.isLock();
//                        if(flag){
//                            Singleton singleton = Singleton.getInstance();
//                            instanceSet.add(singleton.toString());
//                            break;
//                        }
//                    }
                    try{
                        cd.await();
                        Singleton singleton = Singleton.getInstance();
                        instanceSet.add(singleton.toString());
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }


                }
            });
        }
        System.out.println("---End-----");
        Thread.sleep(1000);
        cd.countDown();
        Thread.sleep(1000);
        System.out.println("--------" + instanceSet.size() + "----");
        for(String instance : instanceSet){
            System.out.println(instance);
        }
        executorService.shutdown();
    }

}
