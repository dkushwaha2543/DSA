package String;

import java.util.Arrays;

/*Given a string s consisting of words and spaces,
 return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.*/
public class LengthOfLastWorld {
    public static void main(String[] args) {
        String str = "Hello World";
        int lengthOfLastWord = getLastWordLength(str);
        System.out.println("Length of the last word: " + lengthOfLastWord);
    }

    public static int getLastWordLength(String str) {
        int length = 0;
        int i = str.length() - 1;

        // Move backwards until a non-space character is encountered
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }

        // Count the characters of the last word
        while (i >= 0 && str.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
