package q8;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;



public class code {
    public static byte[] public_key;
    public static String algo = "AES";
    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        Mykey mk = new Mykey("QueZxsweqqER39zZ");

        aes_algo aes = new aes_algo();

        String enc = aes.encrypt("Saravana");
        System.out.println("Encrypted = "+enc);

        String dec = aes.decrypt(enc);
        System.out.println("Decrypted = "+dec);
    }
}
