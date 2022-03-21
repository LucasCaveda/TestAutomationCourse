package solvd.lecture1;

import java.awt.desktop.SystemSleepEvent;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static solvd.lecture1.SortingMethods.sortAscendingArray;
import static solvd.lecture1.SortingMethods.sortDescendingArray;

public class Task2 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int[] array  = new int[10];
        int n = 0;
        int i = 15;
        String s = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChoose an option\n");
        System.out.println("    1. Create a random int array");
        System.out.println("    2. Create an int array manually");
        System.out.println("    3. Create a random string");
        System.out.println("    4. Create a string manually");
        System.out.println("    5. Exit");


        n = scanner.nextInt();
        do{
            switch (n) {
                case 1:
                    createArrayInt(array);
                    break;
                case 2:
                    createUserArray(array);
                    break;
                case 3:
                    s = getRandomString(i);
                    System.out.println("________________________________________________");
                    System.out.println("Your String: "+s);
                    System.out.println("________________________________________________");
                    array= convertString2Array(s);
                    subMenu2(array);
                    break;
                case 4:
                    s=createUserString(s);
                    System.out.println("________________________________________________");
                    System.out.println("Your String: "+s);
                    System.out.println("________________________________________________");
                    array= convertString2Array(s);
                    subMenu2(array);
                    break;
                default:
                    System.out.println("You didn't choose an option");
            }
        }while(n!=5);
    }



        public static void subMenu(int[] array) {

        int option = 0;
        Scanner scanner = new Scanner(System.in);

        new Scanner(System.in);
        System.out.println("\nChoose an option\n");
        System.out.println("    1. sort an array in ascending order ");
        System.out.println("    2. sort an array in descending order ");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                sortAscendingArray(array);
                System.out.println("array sorted ascending: " + Arrays.toString(array));
                break;
            case 2:
                sortDescendingArray(array);
                System.out.println("array sorted descending: " + Arrays.toString(array));
                break;
            default:
                System.out.println("You didn't choose an option");
                break;
            }
        }

    public static void subMenu2(int[] array) {

        int option = 0;
        char[] ch=new char[0];
        Scanner scanner = new Scanner(System.in);

        new Scanner(System.in);
        System.out.println("\nChoose an option\n");
        System.out.println("    1. sort an array in ascending order ");
        System.out.println("    2. sort an array in descending order ");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                sortAscendingArray(array);
                ch=new char[array.length];
                ch=convertIntArray2char(array);
                System.out.print("array sorted ascending: ");
                displayCharArray(ch);
                System.out.println("\n");
                break;
            case 2:
                sortDescendingArray(array);
                ch=new char[array.length];
                ch=convertIntArray2char(array);
                System.out.print("array sorted descending: ");
                displayCharArray(ch);
                System.out.println("\n");
                break;
            default:
                System.out.println("You didn't choose an option");
                break;
        }
    }

    public static void createArrayInt(int[] array) {
        for (int i=0;i<array.length;i++)
            array[i] = (int) (Math.random()*20)+1;
        System.out.println("Array created.");
        subMenu(array);
    }

    public static void createUserArray(int[] array) {
        Scanner scanner=new Scanner(System.in);
        int arraySize;

        System.out.println("Enter the array size");
        arraySize=scanner.nextInt();

        array=new int[arraySize];

        System.out.println("Enter the numbers");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Array created.");
        subMenu(array);
    }

    public static String createUserString(String s){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word");
        s = scanner.nextLine();
        return s;
    }

    /*public static int[] convertString2Array(String s){
        char[] ch=new char[s.length()];

        for(int i=0;i<s.length();i++){
            ch[i] = s.charAt(i);
        }
        int[] in=new int[ch.length];

        for (int i=0;i<ch.length;i++){
            in[i]=(int) ch[i];
        }
        return in;
    }*/

    public static int[] convertString2Array(String s){
        int[] in=new int[s.length()];

        for(int i=0;i<s.length();i++){
            in[i]=s.charAt(i);
        }
        return in;
    }


    public static char[] convertIntArray2char(int[] in){
        char[] ch=new char[in.length];
        for(int i=0;i<in.length;i++){
            ch[i]=(char)in[i];
        }
        return ch;
    }

    public static void displayCharArray(char[] ch){
        for(int i=0;i< ch.length;i++){
            System.out.print(ch[i]);
        }
    }

    static String getRandomString(int i) {
        // bind the length
        byte[] bytearray;
        bytearray = new byte[256];
        String mystring;
        StringBuffer thebuffer;
        String theAlphaNumericS;

        new Random().nextBytes(bytearray);

        mystring
                = new String(bytearray, StandardCharsets.UTF_8);

        thebuffer = new StringBuffer();

        //remove all spacial char
        theAlphaNumericS
                = mystring
                .replaceAll("[^A-Z0-9]", "");

        //random selection
        for (int m = 0; m < theAlphaNumericS.length(); m++) {

            if (Character.isLetter(theAlphaNumericS.charAt(m)) && (i > 0) || Character.isDigit(theAlphaNumericS.charAt(m)) && (i > 0)) {

                thebuffer.append(theAlphaNumericS.charAt(m));
                i--;
            }
        }

        // the resulting string
        return thebuffer.toString();
    }

}




