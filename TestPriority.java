

import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;


public class TestPriority {
    public static void main(String[] args) {

        PriorityQueue<Integer> p1 = new PriorityQueue<>();





        PriorityQueue<Integer> p2 = new PriorityQueue<>(20);
        List<Integer> L= new ArrayList<>();

        L.add(4);
        L.add(0);
        L.add(3);
        L.add(2);
        L.add(1);








        PriorityQueue<Integer> p3 = new PriorityQueue<>(L);
        System.out.println(p3.size());


    }
}
