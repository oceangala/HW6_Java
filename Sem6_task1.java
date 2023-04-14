/*
1. Создайте HashSet, заполните его следующими числами:
{1, 2, 30000, 2, 4, 5000, 6, 3}.
Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами:
{1, 2, 30000, 2, 4, 5000, 6, 3}.
Распечатайте содержимое данного множества.

3. Создайте TreeSet, заполните его следующими числами:
{1, 2, 30000, 2, 4, 5000, 6, 3}.
Распечатайте содержимое данного множества.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sem6_task1 {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>(Arrays.
                asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(mySet);

        LinkedHashSet<Integer> myLinkSet = new LinkedHashSet<>(Arrays.
                asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(myLinkSet);

        TreeSet<Integer> myTreeSet = new TreeSet<>(Arrays.
                asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(myTreeSet);

    }
}