import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 110 элементов случайными цифрами от 0 до 70.

2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:

процент уникальных чисел = количество уникальных чисел * 100 /
общее количество чисел в массиве.
*/
public class Sem6_task2 {
    public static void main(String[] args) {
        int length = 110;
        int l = 0;
        int r = 70;
        Integer[] arr = fillArray(l, r, length);
        System.out.println((double)Math.round(percentUniq(arr)*1000)/1000);

    }
    static Integer[] fillArray(int left, int right, int l){
        Random rand = new Random();
        Integer[] array = new Integer[l];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(left, right);
        }
        return array;
    }

    static Double percentUniq(Integer[] arr){
        Set<Integer> mySet = new HashSet<>();
        Collections.addAll(mySet,arr);
        return (double)(mySet.size()*100)/ arr.length;
    }
}
