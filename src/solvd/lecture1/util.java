package solvd.lecture1;

import java.util.Arrays;

import static solvd.lecture1.SortingMethods.sortAscendingArray;
import static solvd.lecture1.SortingMethods.sortDescendingArray;

public class util {
    public static void main(String[] args) {
        String a= "acbfdgeihkj";
        System.out.println(a);

        char[] ch=new char[a.length()];

        for(int i=0;i<a.length();i++){
            ch[i] = a.charAt(i);
        }

        System.out.println(Arrays.toString(ch));

        int[] a2=new int[ch.length];

        for(int i = 0;i < ch.length; i++){
            a2[i]= ch[i];
        }


        System.out.println(Arrays.toString(a2));

        sortDescendingArray(a2);

        for(int i=0;i< a2.length;i++){
            ch[i]=(char) a2[i];
        }

        System.out.println(Arrays.toString(ch));

        int i= 15/8;
        System.out.println(i);
    }
}
