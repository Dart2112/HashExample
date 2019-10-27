package net.lapsimc;

import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class ProperHash {

    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equalsIgnoreCase("stop")) {
            String hashed = BCrypt.hashpw(input, BCrypt.gensalt());
            System.out.println(hashed);

            input = scan.nextLine();
        }
    }
}
