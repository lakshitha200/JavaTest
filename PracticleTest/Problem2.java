package PracticleTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Problem2 {

    public static List<Object> combineLists(List<String> list1, List<Integer> list2){
        System.out.println(list1);
        System.out.println(list2);

        List<Object> list3 = new ArrayList<>();
        int length = list1.size() + list2.size();

        for (int i = 0; i < length ; i++) {
            if (i < list1.size()) {
                list3.add(list1.get(i));
            }
            if (i < list2.size()) {
                list3.add(list2.get(i));
            }
        }

        System.out.println(list3);
        return null;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        combineLists(list1,list2);
    }
}
