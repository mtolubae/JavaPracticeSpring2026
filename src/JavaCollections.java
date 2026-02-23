//import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.*;
public class JavaCollections {
    public static void main(String[] args){

        ArrayList<Integer> alist = new ArrayList<>();
        LinkedList<Integer> llist = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for (int i=0; i<10; i++){
            if(i%2 != 0) {
                alist.add(i);
                llist.add(i);
                pq.add(i);
                ad.add(i);
            }
            else {
                alist.add(-1*i);
                llist.add(-1*i);
                pq.add(-1*i);
                ad.add(-1*i);
            }
        }

//        System.out.println(alist);
//        System.out.println(llist);
//        System.out.println(pq);
System.out.println(ad);

//        for(int i=0;i<alist.size();i++){
//            System.out.println(alist.get(i));
//        }

//        for (Integer integer : pq) {
//            System.out.print(integer +" ");
//        }

        System.out.println("----------------------------");

        while(!ad.isEmpty()) {
            System.out.print(ad.pollLast() + " ");
        }



    }
}
