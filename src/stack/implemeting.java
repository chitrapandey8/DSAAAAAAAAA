package stack;
//
//class Nodee{
//    int data;
//    Nodee next;
//
//    Nodee(int data){
//        this.data = data;
//        this.next = null;
//    }
//}

import java.rmi.UnexpectedException;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data  = data;
        this.next = null;
    }
}
public class implemeting {
//    Nodee head;
//
//    implemeting(){
//        head = null;
//    }
//
//    void push(int d){
//        //insrt at head
//        if(head == null){
//            head = new Nodee(d);
//        }else {
//            Nodee n = new Nodee(d);
//            n.next = head;
//            head = n;
//        }
//    }
//
//    void pop(){
//        if(head != null){
//            head = head.next;
//        }
//    }
//
//    int top(){
//        return head.data;
//    }
//
//    boolean empty(){
//        return  head == null;
//    }

    Node head;

    implemeting(){
        head = null;
    }

   void push(int d){
        if(head == null){
            head = new Node(d);
        }else{
            Node n =  new Node(d);
            n.next = head;
            head = n;
        }
   }

   void pop(){
        if(head != null){
        head = head.next;
        }
   }

   int  top(){
        return head.data;
   }

   boolean isempty(){
        return  head == null;
   }
}
