package Scaler;

import java.util.concurrent.locks.Lock;

public class Subtractor implements  Runnable{

    private Count count;

    private Lock lock;

    public  Subtractor (Count count){
        this.count = count;


//        this.lock =  lock;
    }
    @Override
    public void run() {
//        lock.lock();
             for(int i = 1; i<=1000; i++){
//                 lock.lock();
//                 synchronized (count){

                 count.SubValue(i);
//                 }
//                 lock.unlock();
             }
//        lock.unlock();
    }
}
