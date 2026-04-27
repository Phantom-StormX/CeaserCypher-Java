package com.phantomstormx.ceasercypherjava;

/* .append adds data to the end of an existing character sequence.
Unlike the + operator for String objects, which creates a brand-new object
for every concatenation, .append() modifies the existing object in place.
*/

/* StringBuilder used to create and manipulate mutable (changeable) sequences of characters.
 Unlike the standard String class, which is immutable and creates a new object every
 time it is modified, StringBuilder allows you to update the content in-place.
 */

public class CipherEngine {
    public static String encrypt(String text, int shift) {

        text = text.toLowerCase();

        StringBuilder message = new StringBuilder();// separate result variable

        for (int i = 0; i < text.length(); i++) { // verifies each character, and starts the loop index at 0
            int charPosition = alpha.indexOf(text.charAt(i));
            if (charPosition == -1) {
                message.append(text.charAt(i)); // keep spaces/punctuation as-is
            } else {
                int keyVal = (charPosition - shift) % 26; // key value, aka shift
                if (keyVal < 0) keyVal = alpha.length() + keyVal;
                message.append(alpha.charAt(keyVal)); // append to message, not text
            }
        }
        return message.toString();   // return the accumulated result
    }

    // Used as a reference for Caesar ciphers to map characters to new positions.
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static StringBuilder Encode(String text, int shift) {
        text = text.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) { // starts the loop index at 0
            int charPosition = alpha.indexOf(text.charAt(i));
            if (charPosition == -1) {
                // Not a letter — keep as-is (spaces, punctuation, digits)
                cipherText.append(text.charAt(i));
            } else {
                int keyVal = (shift + charPosition) % 26;
                cipherText.append(alpha.charAt(keyVal));
            }
        }
        return new StringBuilder(cipherText.toString());
    }
}