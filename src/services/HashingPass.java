package services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingPass {
    public static String PasswordHash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] rbt = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : rbt) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace(); // Handle or log the exception appropriately
        }
        return null;
    }

    public static void main(String[] args) {
        String hashedPassword = PasswordHash("123");
        System.out.println("Hashed Password: " + hashedPassword);
    }
}