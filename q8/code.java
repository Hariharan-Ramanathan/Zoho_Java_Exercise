package q8;

public class code {
    public static byte[] public_key;
    public static String algo = "AES";
    public static void main(String[] args) {
        mykey mk = new mykey("QueZxsweqqER39zZ");

        aes_algo aes = new aes_algo();

        String enc = aes.encrypt("TLina");
    }
}
