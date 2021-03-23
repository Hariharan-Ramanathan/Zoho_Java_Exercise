// Get an input from the user through Command line arguments, and print the encrypted or decrypted text depending on the input
// The input from the user should read as -> Crypto testing key encrypt for encrypting and Crypto /wZf6nsWgQA key decrypt for decrypting(where ascy35;> is the encrypted string). Encrypting and decrypting must be done using the key user gives. Error must be thrown for insufficient input. Use inbuilt or your own encryption logic.
// TIP: Use Cipher to encrypt/decrypt data if you are using inbuilt classes.

package q8;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;



public class Main {
    public static byte[] public_key;
    public static String algo = "AES";
    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        Mykey mk = new Mykey("QueZxsweqqER39zZ");

        aes_algo aes = new aes_algo();

        String enc = aes.encrypt("Hariharan");
        System.out.println("Encrypted = "+enc);

        String dec = aes.decrypt(enc);
        System.out.println("Decrypted = "+dec);
    }
}
