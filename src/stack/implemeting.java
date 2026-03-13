package stack;

class Nodee{
    int data;
    Nodee next;

    Nodee(int data){
        this.data = data;
        this.next = null;
    }
}

public class implemeting {
    Nodee head;

    implemeting(){
        head = null;
    }

    void push(int d){
        //insrt at head
        if(head == null){
            head = new Nodee(d);
        }else {
            Nodee n = new Nodee(d);
            n.next = head;
            head = n;
        }
    }

    void pop(){
        if(head != null){
            head = head.next;
        }
    }

    int top(){
        return head.data;
    }

    boolean empty(){
        return  head == null;
    }
}
