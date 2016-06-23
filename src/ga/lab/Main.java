package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;
        int maxValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        //how do we print a variable to the command line
        System.out.println("summedDoubles = " + summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        //how do we print a variable to the command line
        System.out.println("summedDoubles = " + summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        //how do we print a variable to the command line
        System.out.println("summedDoubles = " + summedDoubles);

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        //how do we print a variable to the command line
        System.out.println("summedDoubles = " + summedDoubles);


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        //how do we print a variable to the command line
        System.out.println("charString = " + charString);

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        //how do we print a variable to the command line
        System.out.println("charString = " + charString);

        charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        //how do we print a variable to the command line
        System.out.println("charString = " + charString);

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        //how do we print a variable to the command line
        System.out.println("charString = " + charString);

        //Problem 6:
        //Put your code for problem 6 here

        List<String> myStringList = new ArrayList<>();
        myStringList.add("Christopher Hitchens");
        myStringList.add("Richard Dawkins");
        myStringList.add("Alan Turing");
        myStringList.add("Sam Harris");
        myStringList.add("John von Neumann");


        //Problem 7:
        reversedStringOrder(myStringList);

        //Problem 8:
        printOrAdd(myStringList);

        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.
        int[] oddSizedArray = new int[13];
        for (int i = 0; i < oddSizedArray.length; i++)
            oddSizedArray[i] = i + 1;


        //Problem 10:
        middleValue = findMiddle(oddSizedArray);
        //how do we print a variable to the command line
        System.out.println("middleValue = " + middleValue);

        middleValue = findMiddle(new int[]{2,7,9,12,15});
        //how do we print a variable to the command line
        System.out.println("middleValue = " + middleValue);

        middleValue = findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line
        System.out.println("middleValue = " + middleValue);

        middleValue = findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line
        System.out.println("middleValue = " + middleValue);

    }

    private static int findMiddle(int[] oddSizedArray) {
        return oddSizedArray[(oddSizedArray.length / 2)];
    }

    private static void printOrAdd(List<String> strList) {
        int size = strList.size();

        if (size == 10) {
            for (int i = 0; i < size; i++){
                System.out.println(strList.get(i));
            }
        }
        else if (size < 10) {
            strList.add("Java" + size);
        }
    }

    static void reversedStringOrder(List<String> strList) {
        for (int i = 0; i < strList.size(); i++){
            String str = strList.get(i);
            String revStr = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                revStr += str.charAt(j);
            }
            System.out.println(revStr);
        }
    }

    static String charsToString(char[] charArray) {
        String str = "";

        for (int i = 0; i < charArray.length; i++) {
            str += charArray[i];
        }

        return str;
    }

    static double sumOfValues(double[] doubleArray) {
        double total = 0.0;

        for (int i = 0; i < doubleArray.length; i++) {
            total += doubleArray[i];
        }

        return total;
    }

    static int maxValue(int[] intArray) {
        int maxValue = intArray[0];

        for (int i = 1; i < intArray.length; i++){
            if (intArray[i] > maxValue)
                maxValue = intArray[i];
        }
        System.out.println("Max value is " + maxValue);
        return maxValue;
    }

    static void reversedOrder() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++)
            intArray[i] = i;
        for (int i = intArray.length - 1; i >= 0; i--)
            System.out.println(intArray[i]);
    }

    static void stringLengthOrValue(String str) {
        int strLen = str.length();
        if (strLen > 5)
            System.out.println(str);
        else
            System.out.println(strLen);
    }

}
