//Занятие 2. Задача 1. Работа с числами

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // без Stream API
        for (int s : intList) {
            if (s <= 0 || s % 2 == 1) {
                intList.remove(s);
            }
        }
        Collections.sort(intList);

        System.out.println(intList);

    }
}