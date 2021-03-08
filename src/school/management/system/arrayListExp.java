package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Array List Explanation
 * An array strores a specific number/amount
 * An array list is resizeable, and the number/amount can vary
 */
public class arrayListExp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //<Integer> adds all the number values to the list, the same can be done with a <string>

        numbers.add(45);
        numbers.add(45);
        numbers.add(45);

        System.out.println(numbers);



    }
}
