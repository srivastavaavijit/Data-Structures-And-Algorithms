package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistImplementation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // syntax:
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(20);

        System.out.println(list);

        list.addFirst(50);

        System.out.println(list);

        list.set(2,100);

        System.out.println(list);

        list.add(in.nextInt());

        System.out.println(list);
    }
}
