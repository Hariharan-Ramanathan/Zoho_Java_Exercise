package q8;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;

public class aes_algo {
    public String encrypt(String str){
        Key key = generateKey();
        return key;
    }

    private Key generateKey() {
        Key key = new SecretKeySpec(code.public_key, code.algo);
        return key;
    }
}
