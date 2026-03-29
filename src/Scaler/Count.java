package Scaler;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
//    int value = 0;
    AtomicInteger value = new AtomicInteger(0);
    public synchronized   void  AddValue(int i){
//        this.value += i;
        this.value.addAndGet(i);
    } //makig method synchronised third method
    public synchronized void  SubValue(int i){
//        this.value -= i;
        this.value.addAndGet(-i);
    }
}
