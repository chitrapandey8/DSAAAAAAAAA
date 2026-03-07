package Scaler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main() {
//        Helloworldprinter hm = new Helloworldprinter();
//        Thread t = new Thread(hm);
//        t.start();
//
//        System.out.println("hello world" + Thread.currentThread().getName());

//        for(int i = 1; i<=100; i++){
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np); //thread ko runnable object diya hai , thread ko pata h ki run method excute karna hai
//            t.start();  ///ye naya thread start krta hai  //thread internally ye np.run() calll karega, multiple thread parellael run krte hai aur numbers print krte hai
//        }

        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i =1; i<= 100; i++){
            es.execute(new NumberPrinter(i));
        }
    }
}
