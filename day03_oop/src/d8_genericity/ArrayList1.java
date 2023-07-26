package d8_genericity;

import java.util.ArrayList;

public class ArrayList1<E> {
    ArrayList<E> list;
    public void add(E s) {
        list.add(s);
    }

    public E get(int i) {
        if(i<list.size()){

            return list.get(i);
        }else{
            System.out.println("超过列表长度了，请你检查一遍，确认无误");
            return null;
        }
    }
}
