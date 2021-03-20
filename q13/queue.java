package q13;

import java.util.ArrayList;
import java.util.List;

public class queue {
    List<Integer> q = new ArrayList<>();


    public void Enqueue(int a){
        q.add(a);
    }

    public int Dequeue(){
        int ret = q.get(0); 
        q.remove(0);
        return ret;
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    public void add(int i) {
    }
}
