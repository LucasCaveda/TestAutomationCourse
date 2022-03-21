package solvd.lecture1;

public class SortingMethods {

    public static void insertArray(int[] array, int aLength, int d){
        int i= aLength;
        while(i>=0 && array[i]>d){
            array[i+1]=array[i];
            i--;
        }
        array[i+1]=d;
    }

    public static void sortAscendingArray(int[] array) {
        int i=0;
        //int l= array.length;
        while (i < array.length-1){
            insertArray(array,i,array[i+1]);
            i++;
        }
    }

    public static void sortDescendingArray(int[] array) {
        int i=0;
        while (i < array.length-1){
            insertArray2(array,i,array[i+1]);
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
