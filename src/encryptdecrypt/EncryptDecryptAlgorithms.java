package encryptdecrypt;

interface EncryptDecryptAlgorithms {

    char[] encrypt(String data, int key);

    char[] decrypt(String data, int key);

}
