package encryptdecrypt;

public class CryptAlgorithmClient {

    EncryptDecryptAlgorithms algorithm;

    public void setAlgorithm(EncryptDecryptAlgorithms algorithm) {
        this.algorithm = algorithm;
    }

    public char[] encrypt(String data, int key) {
        return this.algorithm.encrypt(data, key);
    }

    public char[] decrypt(String data, int key) {
        return this.algorithm.decrypt(data, key);
    }
}
