package Scaler;

import java.util.concurrent.locks.Lock;

public class Adder implements  Runnable{


    private  Count count;
    private Lock lock;
                //Lock lock
    public Adder(Count count){
          this.count  = count;


//      this.lock = lock;
    }

    @Override
    public void run() {
//        lock.lock();
        for(int i = 1; i<=1000; i++){
//            lock.lock();
//            synchronized (count){

         count.AddValue(i);
//            }
//         lock.unlock();
        }
//        lock.unlock();
    }
}
