package encryptdecrypt;

class UnicodeAlgorithm implements EncryptDecryptAlgorithms {

    @Override
    public char[] encrypt(String data, int key) {
        char[] inputCharArray = data.toCharArray();
        char[] encryptCharArray = new char[inputCharArray.length];
        for (int i = 0; i < inputCharArray.length; i++) {
            encryptCharArray[i] = (char) (inputCharArray[i] + key);
        }
        return encryptCharArray;
    }

    @Override
    public char[] decrypt(String data, int key) {
        char[] cryptCharArray1 = data.toCharArray();
        char[] decryptCharArray = new char[cryptCharArray1.length];
        for (int i = 0; i < cryptCharArray1.length; i++) {
            decryptCharArray[i] = (char)(cryptCharArray1[i] - key);
        }
        return decryptCharArray;
    }

}
