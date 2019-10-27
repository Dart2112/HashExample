package net.lapsimc;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Hash {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equalsIgnoreCase("stop")) {
            byte[] hash = md.digest(input.getBytes());
            BigInteger bigInt = new BigInteger(1, hash);
            StringBuilder hashText = new StringBuilder(bigInt.toString(16));
            while (hashText.length() < 32) {
                hashText.insert(0, "0");
            }
            System.out.println(hashText);

            input = scan.nextLine();
        }
    }

}
