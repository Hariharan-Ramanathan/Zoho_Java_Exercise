package q8;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class aes_algo {
    
    private Key generateKey() {
        Key key = new SecretKeySpec(code.public_key, code.algo);
        return key;
    }
    
    public String encrypt(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        Key key = generateKey();
		Cipher c = Cipher.getInstance(code.algo);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(str.getBytes());
        String encryptedValue = Base64.getEncoder().encodeToString(encVal);
		return encryptedValue;
    }

    public String decrypt(String enc) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(code.algo);
        c.init(Cipher.DECRYPT_MODE, key);
        byte decryptedValue[] = Base64.getDecoder().decode(enc);
        byte dec_byte[] = c.doFinal(decryptedValue);
        String ret = new String(dec_byte);
        return ret;
    }
}
