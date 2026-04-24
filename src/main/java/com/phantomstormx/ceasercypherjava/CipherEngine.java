package com.phantomstormx.ceasercypherjava;

public class CipherEngine {
    public static String decrypt(String text, int shift) {

        text = text.toLowerCase();

        StringBuilder message = new StringBuilder();// <-- separate result variable

        for (int i = 0; i < text.length(); i++) {
            int charPosition = alpha.indexOf(text.charAt(i));
            int keyVal = (charPosition - shift) % 26; // key value, aka shift
            if (keyVal < 0) {
                keyVal = alpha.length() + keyVal;
            }
            char replaceVal = alpha.charAt(keyVal);
            message.append(replaceVal);   // <-- append to message, not text
        }
        return message.toString();   // <-- return the accumulated result
    }

    // Used as a reference for Caesar ciphers to map characters to new positions.
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static StringBuilder encrypt(String text, int shift) {
        text = text.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < text.length(); i++) {
            int charPosition = alpha.indexOf(text.charAt(i));
            if (charPosition == -1) {
                // Not a letter — keep as-is (spaces, punctuation, digits)
                cipherText += text.charAt(i);
            } else {
                int keyVal = (shift + charPosition) % 26;
                cipherText += alpha.charAt(keyVal);
            }
        }
        return new StringBuilder(cipherText);
    }
}


