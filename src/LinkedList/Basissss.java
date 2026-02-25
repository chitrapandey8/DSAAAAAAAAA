package  LinkedList;

//class  Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}

public class Basissss{
    static void main() {

        Node head  = null;
        Node newnode1 = new Node(10);
        Node newnode2 = new Node(12);
        Node newnode3 = new Node(14);
        Node newnode4 = new Node(16);
        Node newnode5 = new Node(18);

        head = newnode1;
        newnode1.next = newnode2;
        newnode2.next = newnode3;
        newnode3.next = newnode4;
        newnode4.next =  newnode5;
        newnode5.next = null;

        //insertion at benginin++++++++++++++

//        Node newnode = new Node(8);

//        newnode.next =  head;   ///head jispe khada khada hai voh pura node newnode ke next mai daal do coz nect pura node contain krta hai
//        head = newnode;  //as mera head first position pe rehna chahiye


//        Node curr = head;
//
//        while(curr != null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

       //insertion at the end;
//        Node newnode  = new Node(20);
//        if(head.next == null){
//            head.next = newnode;
//        }
//        Node curr = head;
//        while(curr.next!=null){
//            curr = curr.next;
//        }
//        curr.next =  newnode;
//        Node curr1 = head;
//        while(curr1 != null){
//            System.out.println(curr1.data);
//            curr1 = curr1.next;
//        }

        //insert at any position

//        int pos = 3;
//        Node curr = head;
//        Node newnode = new Node(22);
//        for(int i = 1; i<=pos-2 && curr!=null; i++){
//
//            curr= curr.next;
//        }
//        if(curr==null){
//            return;
//        }
//        newnode.next = curr.next;
//        curr.next = newnode;
//
//        Node curr1 = head;
//        while(curr1 != null){
//            System.out.println(curr1.data);
//            curr1 = curr1.next;
//        }

        //insert by value----------------------------------

//        int value = 12;
//        Node newnode =  new Node(24);
//        Node curr = head;
//
//        while(curr!=null){
//            if(curr.data == value){
//                newnode.next = curr.next;
//                curr.next = newnode;
//
//            }
//            curr =  curr.next;
//        }
//        Node curr1 = head;
//        while(curr1 != null){
//            System.out.println(curr1.data);
//            curr1 = curr1.next;
//        }
//

        //deletion at node

//        if(head.next == null){
//            head  = null;
//        }
//
//        head = head.next;

         Node curr = head;
         while(curr.next.next != null){
        curr = curr.next;

         }

               curr.next = null;

        Node curr1 = head;
        while(curr1 != null){
            System.out.println(curr1.data);
            curr1 = curr1.next;
        }



    }
}
