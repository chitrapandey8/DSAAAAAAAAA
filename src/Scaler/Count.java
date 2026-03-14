package Scaler;

public class Count {
    int value = 0;
    public synchronized   void  AddValue(int i){
        this.value += i;
    } //makig method synchronised third method
    public synchronized void  SubValue(int i){
        this.value -= i;
    }
}
