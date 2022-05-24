package data_structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
//        System.out.println(list);
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//        }
        for (Integer item:
             list) {
            System.out.println(item);
        }
    }
}
