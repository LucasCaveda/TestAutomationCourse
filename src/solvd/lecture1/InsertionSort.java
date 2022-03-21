package solvd.lecture1;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        task1();
    }

    public static void task1(){
        int[] array = {2,1,4,3,8,10,9,44,5,21};

        System.out.println("Unordered array: "+ Arrays.toString(array));

        sortArray(array);

        System.out.println("Ordered array: "+ Arrays.toString(array));

    }

    public static void insertArray(int[] array, int aLength, int d){
        int i= aLength;
        while(i>=0 && array[i]>d){
            array[i+1]=array[i];
            i--;
        }
        array[i+1]=d;
    }

    public static void sortArray(int[] array) {
        int i=0;
        //int l= array.length;
        while (i < array.length-1){
            insertArray(array,i,array[i+1]);
            i++;
        }
    }

    public static void insertArray2(int[] array, int aLength, int d) {
        int i = aLength;
        while (i >= 0 && array[i] < d) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = d;
    }
}
