package Scaler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static void main() throws  Exception{
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
//
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for(int i =1; i<= 100; i++){
//            es.execute(new NumberPrinter(i));
//        }

        //main method thread ko sorting task deta hai
//        List<Integer> arraytosort = List.of(4,2,6,1,9,3,4); //input list banayi
//
//        ExecutorService es = Executors.newCachedThreadPool(); //threadpool ye thread soring part excute karegfe
//
//        Sorter s = new Sorter(arraytosort); //object banaya
//
//        Future<List<Integer>> future = es.submit(s); //threads ko task diya submit deta hai task return hua future object, future mtlb jo result bad mai milega
//
//        List<Integer> sl = future.get(); //jab tak sorting complete nhi hoti main thread wait karega .get wait krta hai
//
//        System.out.println("sorted" + sl);
//
//        es.shutdown(); //program close karen ke liye


        //synchronization problem happens when two thread work on same data at same time
        //1.critical section more than 1 thread data share akre
        //2.race condioton ---more than 1 threads is competing with each other,whwn more than 1 thread is in critiacal section at the same time, when two ot more process try to accessa nf modify data at same timt
        //3.premption -- ek thread ko rok deta hai,or dusrre ko proiroy deta hai

        //what a good soln of sync should be
        //1.Mutual exclution -- only one thread should be there in cs ata same time
        //2.progress --overall system shoutl keeo on working
        //Bounded waiting --no thread will have to wait indefedily, wvwy process should at fair chance to enter cirtical section
        //4.No buay waiting --conditon check ke liye wait karta rehta hai, cpu waste hota ahu baki process slow ho jatehai
        Count c = new Count();
        Lock lock =  new ReentrantLock();

        Thread t1 = new Thread(new Adder(c)); //,lock
        Thread t2 = new Thread(new Subtractor(c));

        t1.start(); //t1 c.value ko ++ karega
        t2.start();

        t1.join(); //main thread wait karega jab tak t1 aur t2 complete nhi ho jata dusri line mai nhi karega
        t2.join();

        System.out.println(c.value);
    }
}
