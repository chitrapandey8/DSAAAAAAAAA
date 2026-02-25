package LinkedList;

import java.util.HashSet;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LL {
    static void main() {


         Node newnode1 = new Node(5);
         Node newnode2 = new Node(10);
         Node newnode3 = new Node(9);
         Node newnode4 = new Node(10);
         Node newnode5 = new Node(25);

         Node head = newnode1;  //the head is always is on the first node
        newnode1.next = newnode2;
        newnode2.next = newnode3;
        newnode3.next = newnode4;
        newnode4.next = newnode5;
        newnode5.next = null;

        /// /traverse---------------
//        Node curr = head;
//        while(curr!=null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

        //////////////////////////////////////////INSERTTT///////////////////////////////////////////////////

        /// 1.Insert at beggining

//        Node newnopde = new Node(1);
//        newnopde.next  = head;
//        head =  newnopde;


        /// 2.at the End
//        Node newnode6 = new Node(5);
//        Node curr = head;
//
//        while (curr.next!= null) {
//            curr = curr.next;
//
//        }
//        curr.next =  newnode6;


        //3.Insert at the given pos

//        int pos = 3;
//        Node newpos= new Node(3);
//        Node curr =  head;
//        for(int i  = 1; i<=pos-2 && curr != null; i++){
//            curr = curr.next;
//        }
//
//        newpos.next = curr.next;
//        curr.next = newpos;

        //4.after a given value

//        int value = 10;
//        Node curr = head;
//        Node newdata  = new  Node(11111111);
//        while(curr!=null){
//            if(curr.data == value){
//                newdata.next = curr.next;
//                curr.next = newdata;
//            }
//            curr = curr.next;
//        }


        /// ////////////////////////////////////DELETE//////////////////////////////////////////////////////
        //1.delete from the begiining

//        if(head.next == null){
//            head = null;
//        }
//
//        head = head.next;


        //2.delete from the end;

//        Node curr = head;
//        while(curr.next.next!=null){
//
//            curr = curr.next;
//        }
//        curr.next = null;


        //3.dete from a given value;
//        int value = 10;
//        Node curr = head;
//        while(curr.next!=null){
//            if(curr.next.data == value){
//                curr.next = curr.next.next;
//            }
//            curr = curr.next;
//        }


         /// /////////////////////////////////////////SEARCHH//////////////////////////////////////////////////////////////////////
//        Node curr = head;
//         int data = 15;
//
//         while(curr!=null){
//             if(curr.data == data){
//                 System.out.println("found");
//                 break;
//             }else{
//                 System.out.println("Not founf");
//             }
//
//
//             curr = curr.next;
//         }
        /// ////////////////////////////////////////////////////////REVERSE THE LINKED LIST//////////////////////////////////////////////////

//          Node prev = null;
//          Node next = null;
//          Node curr = head;
//
//          while(curr != null){
//              next  = curr.next;
//              curr.next = prev;
//
//              prev = curr;
//              curr  = next;
//
//
//          }
//
//          head = prev;

        /// ////////////////////////////////////////////////////////DETECTTT CYCLE???????????????????????????????????????????????????????????????????????????????
//        Node slow = head;
//        Node fast  =  head;
//        Node curr  = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast  = fast.next.next;
//
//            if(slow == fast){
//                System.out.println("yas");
//            }
//
//
//        }

 /// /////////////////////////////////////////////////////////////MIDDLE ELEMENT???????????////////////////////////////////////////////////
//
//        Node slow  = head;
//        Node fast = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast =  fast.next.next;
//        }
//        System.out.println(slow.data);

        /// /////////////////////////////////////////////////////REMOVE DUPLICATES????????????????????????????????????????????????????????????????????????????
        //1.sorted
//         Node curr = head;
//         while(curr != null && curr.next != null){
//             if(curr.data == curr.next.data){
//                 curr.next = curr.next.next;
//             }else{
//
//             curr = curr.next;
//             }

//         }
        //2.unsorteddd
//        HashSet<Integer> Hs = new HashSet<>();
//        Node curr = head;
//        Node prev = null;
//
//        while(curr != null){
//            if(Hs.contains(curr.data)){
//                prev.next = curr.next;
//            }else{
//                Hs.add(curr.data);
//                prev =  curr;
//            }
//            curr = curr.next;
//        }



        Node curr1 =  head;
        while(curr1!=null){
            System.out.println(curr1.data);
            curr1 = curr1.next;
        }
    }
}
