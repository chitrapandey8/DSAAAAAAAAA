package stack;

import java.util.Stack;

public class stacktest {
    static void main() {
//        implemeting im = new implemeting();
//        im.push(1);
//        im.push(2);
//        im.push(3);
//        im.push(4);
//
//        while(!im.empty()){
//            int x = im.top();
//            System.out.println(x);
//            im.pop();
//        }
//
//        Stack<Integer> s =  new Stack<>();
//        s.push(4);
//        s.push(5);
//        s.push(6);
//        System.out.println();
//

        implemeting in  = new implemeting();

        in.push(1);
        in.push(2);
        in.push(3);
        in.push(4);

        while(!in.isempty()){
            int data = in.top();
            System.out.println(data);
            in.pop();
        }

    }
}
