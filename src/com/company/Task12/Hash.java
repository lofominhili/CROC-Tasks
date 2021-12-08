package com.company.Task12;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash extends Thread {

    private final String hash;

    private final char symbol;

    private final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();

    public Hash(String hash, char symbol) {
        this.hash = hash;
        this.symbol = symbol;
    }

    private String toHexString(byte[] bytes) {
        StringBuilder hex = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            hex.append(HEX_DIGITS[(b & 0xff) >> 4]);
            hex.append(HEX_DIGITS[b & 0x0f]);
        }
        return hex.toString();
    }

    private String hashPassword(String password) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        digest.update(password.getBytes());
        byte[] bytes = digest.digest();
        return toHexString(bytes);
    }

    public boolean compareWithHash(String password, String hash) {
        return hashPassword(password).equals(hash);
    }

    public String getPassword() {
        StringBuilder password = new StringBuilder();
        for (char a = symbol; a <= 'z'; a++)
            for (char s = 'a'; s <= 'z'; s++)
                for (char y = 'a'; y <= 'z'; y++)
                    for (char m = 'a'; m <= 'z'; m++)
                        for (char b = 'a'; b <= 'z'; b++)
                            for (char o = 'a'; o <= 'z'; o++)
                                for (char l = 'a'; l <= 'z'; l++) {
                                    if (isInterrupted()) return "";
                                    password.append(a).append(s).append(y).append(m).append(b).append(o).append(l);
                                    if (compareWithHash(password.toString(), hash)) {
                                        return password.toString();
                                    }
                                    password.delete(0, 7);
                                }
        return null;
    }

    @Override
    public void run() {
        System.out.println(getPassword());
        for (Thread thread : Thread.getAllStackTraces().keySet())
            thread.interrupt();
    }
}
