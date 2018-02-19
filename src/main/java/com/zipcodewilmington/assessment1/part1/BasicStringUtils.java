package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {


        String capitalized = str.substring(0, 1).toUpperCase() + str.substring(1);

        return capitalized;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversed = reverse(str);
        String capitalized = camelCase(reversed);
        return capitalized;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String removedFirstChar = str.substring(1);
        String removedLastChar = removedFirstChar.substring(0, removedFirstChar.length()-1);
        return removedLastChar;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++)
        {
            char c = charArr[i];
            if (Character.isUpperCase(c))
            {
                charArr[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                charArr[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArr);
    }
}
