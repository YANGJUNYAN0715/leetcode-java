package data_structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student("11",30);
        Student s2 = new Student("22",23);
        Student s3 = new Student("33",21);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        for(int i=0;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
