package com.telran.prof.lesson.lessonfive;

import java.util.Arrays;

public class TestArrayThree {

    public static void main(String[] args) {
        int [][] arr = {{1,2},{7,4},{8,5,4,9},{1}};
        int i = arr[0][1];
        int i1 = arr[1][0];
        int i2 = arr[2][3];

        int[][][] array = new int[2][2][2];
        array[0][0][0] = 1;
        int[][][] arrayTwo = {{{1,2},{7,4},{8,5,4,9},{1}},{{5, 6, 7, 8}, {1, 2}, {4, 5, 6, 7, 9, 9}}};
        System.out.println(Arrays.deepToString(arrayTwo[0]));
        System.out.println(Arrays.deepToString(arrayTwo[1]));

        System.out.println(Arrays.toString(arrayTwo[0][0]));
        System.out.println(arrayTwo[0][0][1]);
        System.out.println(arrayTwo);
    }
}
