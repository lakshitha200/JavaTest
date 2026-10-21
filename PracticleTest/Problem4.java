package PracticleTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {

    public static void nonNegative(List<Integer> numbers){

        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        System.out.println(stringList);
        stringList.sort(Collections.reverseOrder());
        System.out.println(stringList);

        String result = "";
        for (String num : stringList) {
            result = result + num;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(2);
        list.add(1);
        list.add(9);

        nonNegative(list);
    }
}
