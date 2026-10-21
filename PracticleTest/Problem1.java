package PracticleTest;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    // for-loop
    public static int takeSum(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println(sum);
        return sum;
    }

    //while-loop
    public static int takeSum2(List<Integer> numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }
        System.out.println(sum);
        return sum;
    }

    //recursion
    // ----

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        takeSum(list);
        takeSum2(list);
    }
}
