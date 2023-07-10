package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] stuff = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            stuff[i] = array[array.length - 1 - i]; // the index (i) tells us where in the array stuff we are
        } // the value we want to swap with the current index of stuff

        return stuff;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] palindrome = reverse(array);
        // call the reverse method
        // this sets the new string array to the method that was just called
        for (int i = 0; i < array.length; i++) {

            if (palindrome[i] != array[i]) // that both strings should equal to each other if they are a palindrome
                return false;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

//     for (int i = 0; i < array.length; i++){   the for loop for the array length
//         String word = array[i];
//         for (int p = 0; p < word.length();p++){ the for loop for to track the letters in the array
//             if (word.charAt(i) ==
//         }
        String pangram = Arrays.toString(array).toLowerCase(); //declared a new string
        // and converted the array to a string to lowercase
        boolean real = true; // declared a boolean to be true unless it is proven false

        for (char i = 'a'; i <= 'z'; i++) {
            //for loop was created to loop each character in the alphabet
            if (!pangram.contains(String.valueOf(i))) {
                // checking to see if the letter is not in the string
                real = false;
                // if not then it is false
            }

        }
        return real;
        // we will get back the boolean result -> did it stay true or was it found to be false?
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int ct = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value))
                ct++;
        }
        return ct;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < array.length; i++) {
            // for loop to keep track of the number of strings in the array
            if (array[i].equals(valueToRemove)) {
                list.remove(array[i]);
            }
        }
        return list.toArray(new String[0]);
    }



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        for (int i = 1; i < list.size(); i++){
            String old = list.get(i - 1);
            String curr = list.get(i);

            if (old.charAt(0) == curr.charAt(0)) {
                list.set(i, old + curr);
                list.remove(old);
                     i--;
            }
        }

        return list.toArray(new String[0]);
    }


}
