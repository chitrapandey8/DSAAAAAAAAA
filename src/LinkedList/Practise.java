package LinkedList;

class LLL{
    int data;
    LLL next;

    LLL(int data){
        this.data = data;
        this.next = null;
    }

}

public class Practise {
    static int size(LLL head) {
        int count = 0;
        LLL curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static LLL InsertAtcorrectposition(LLL head, int data) {
        LLL curr = head;

        while(curr != null){
            if(curr.next.data > data){
                LLL newnodee = new LLL(1222);
                newnodee.next = curr.next;
                curr.next = newnodee;
            }
            curr = curr.next;
        }
        return head;
    }

    static void getkthelemet(LLL head, int k) {

    }

    static LLL createL(int N) {
        LLL newnode = new LLL(1);
        LLL head  = newnode;
        LLL temp  = head;

        for(int i = 2; i<=N; i++){
            temp.next = new LLL(i);
            temp = temp.next;
        }
        return  head;
    }

    static LLL print(LLL head) {
        LLL curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        return head;
    }

    static LLL reversealinkedlistbyk(LLL head, int k) {
        //base case
        if(size(head) < k){
            return head;
        }

        /// REcursion reversing the first k nodes
        LLL curr = head;
        LLL prev  = null;
        LLL next  = null;
        int count = 0;
        while(count<k){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
            count++;
        }
        if(curr != null){
            head.next = reversealinkedlistbyk(curr,k);
        }
        return prev;
    }

    static void insertafterpos(LLL head, int pos) {

    }

    static void main() {
//        LLL head = null;
//
//        LLL Newnode1 = new LLL(1);
//        LLL Newnode2 = new LLL(2);
//        LLL Newnode3 = new LLL(3);
//        LLL Newnode4 = new LLL(4);
//
//        head = Newnode1;
//        Newnode1.next = Newnode2;
//        Newnode2.next = Newnode3;
//        Newnode3.next = Newnode4;
//        Newnode4.next = null;
//
//        LLL curr = head;
//        while(curr!=null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }


        // this is also a way---by adding at tail
//        LLL tail = new LLL(1);
//        LLL head = tail;
//
//        tail.next = new LLL(2);
//        tail = tail.next;
//        tail.next = new LLL(3);
//        tail  = tail.next;
//
//        LLL curr = head;
//        while(curr!=null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

        //AADING WITH A LOOP !TO !)


//        LLL curr = head;
//        while(curr!=null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

        //connecting a new node at head
//        LLL newnode  = new LLL(1);
//        LLL head = newnode;
//
//        LLL newnode1 = new LLL(0);
//        newnode1.next = newnode;
//        head = newnode1;
//
//
//        LLL curr = head;
//        while(curr!=null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

        /// Insert at pos

//        int pos = 4;
//
//        LLL newnoden = new LLL(1000);
//
//        //edge case
//        if(pos == 0){
//           newnoden.next = head;
//           head = newnoden;
//        }else{
//            LLL temp1  = head;
//            for(int i = 1; i<=pos-1;i++){
//                if(temp1 == null){
//                    System.out.println("Position out of bound");
//                }
//                temp1  = temp1.next;
//            }
//            newnoden.next = temp1.next;
//            temp1.next = newnoden;
//
//        }

        //getKTh eleemnt





        /// insert after a pos


       // System.out.println(InsertAtcorrectposition(head,3));

//        LLL linkedlist =  createL(10);
//        print(linkedlist);

        LLL linkedlist =  createL(11);
        print(reversealinkedlistbyk(linkedlist,3));

    }
}
