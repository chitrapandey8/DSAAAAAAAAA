package LinkedList;
class DLLL{
    int data;
    DLLL  prev;
    DLLL next;

    DLLL(int data){
        this.data = data;
    }
}


public class DLL {
    static void main() {
        DLLL head = null;
        DLLL tail = null;

        DLLL newnode1 = new DLLL(10);
        DLLL newnode2 = new DLLL(12);
        DLLL newnode3 = new DLLL(14);
        DLLL newnode4 = new DLLL(16);
        DLLL newnode5 = new DLLL(18);
        DLLL newnode6 = new DLLL(20);

         head = newnode1;


         newnode1.next =  newnode2;
         newnode1.prev = null;

         newnode2.next = newnode3;
         newnode2.prev = newnode1;

         newnode3.next = newnode4;
         newnode3.prev = newnode2;

         newnode4.next  = newnode5;
         newnode4.prev = newnode3;

         newnode5.next = newnode6;
         newnode5.prev = newnode4;

         newnode6.prev = newnode5;
         newnode6.next = null;

         tail = newnode6;







//         DLLL curr = head;
//         while(curr != null){
//             System.out.println(curr.data);
//             curr = curr.next;
//         }

//         DLLL curr1 = tail;
//         while(curr1 != null){
//             System.out.println(curr1.data);
//             curr1 = curr1.prev;
//         }

        /// //////////insert at head////////////////////
//        DLLL newnode = new DLLL(8);
//        if(head == null){
//            return;
//        }
//
//        newnode.next =  head;
//        newnode.prev  = null;
//
//        head = newnode;
//
//        DLLL curr = head;
//        while(curr != null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

         /// ////////////////insert at end////////////////////////////////

//         DLLL newnode  = new  DLLL(20);
//
//          tail.next = newnode;
//          tail = newnode;
//
//        DLLL curr = head;
//        while(curr != null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }


        /// /insert after a node

//        int data = 16;
//        DLLL curr = head;
//        while(curr!=null) {
//            if (curr.data == data) {
//                DLLL newnode  = new DLLL(1111111);
//                newnode.next = curr.next;
//                newnode.prev = curr;
//
//                if (curr.next != null) {
//                    curr.next.prev = newnode;
//                } else {
//                    tail = newnode;
//                }
//
//                curr.next = newnode;
//                break;
//
//            }
//            curr = curr.next;
//        }
//
//            DLLL currr = head;
//            while(currr != null){
//                System.out.println(currr.data);
//                currr = currr.next;
//            }

        /// ////////////////////////insert before///////////////////////////
//        int data = 16;
//
//        DLLL curr = head;
//
//        while(curr!=null){
//            if(curr.data == data){
//                DLLL newnode  = new DLLL(788);
//
//                 newnode.next = curr;
//                 newnode.prev = curr.prev;
//
//                 if(curr.prev == null){
//                     head = newnode;
//                 }else{
//                     curr.prev.next = newnode;
//                 }
//
//                 curr.prev = newnode;
//            }
//
//            curr = curr.next;
//        }
//


        ////////////////////////////////////////////////////DELETE////////////////////////////////////////////////

        ///.......from begining.............
//        if(head.next == null){
//            head = tail =  null;
//        }
//
//
//        head = head.next;
//        head.prev = null;
//

        ///from last///////////

//        if(tail == head){
//            head = tail = null;
//        }
//
//        tail = tail.prev;
//        tail.next = null;
//
//
//
//        DLLL currr = head;
//        while(currr != null){
//            System.out.println(currr.data);
//            currr = currr.next;
//        }
        
        /// ////////////////////////DELETE??????????????????????????
        
//        if(head == tail){
//            head = tail = null;
//        }
//
//
//        int datta = 788;
//
//       DLLL cur = head;
       
        
       
        
        

    }
}
