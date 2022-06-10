package internship;

import java.util.*;

public class list_duplicate_element {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        list2.add("b");
        list2.add("d");
        System.out.println(findDuplicate(list1, list2));
    }

    public static String findDuplicate(List<String> list1, List<String> list2) {
        ArrayList<String> duplicate = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list3 = new ArrayList<>(new HashSet<>(list1));
        ArrayList<String> list4 = new ArrayList<>(new HashSet<>(list2));
        for (String s : list3) {
            map.put(s, 1);
        }
        for (String s : list4) {
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == 2) {
                duplicate.add(m.getKey());
            }
        }
        return duplicate.toString();
    }
}
