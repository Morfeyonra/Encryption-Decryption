package encryptdecrypt;

class ShiftAlgorithm implements EncryptDecryptAlgorithms {

    @Override
    public char[] encrypt(String data, int key) {
        char[] inputCharArray = data.toCharArray();
        char[] encryptCharArray = new char[inputCharArray.length];
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] >= 65 && inputCharArray[i] <= 90) {
                encryptCharArray[i] = Character.codePointAt(inputCharArray, i) + key <= 90 ?
                        (char)(inputCharArray[i] + key) : (char)(inputCharArray[i] + key - 26);
            } else if (inputCharArray[i] >= 97 && inputCharArray[i] <= 122) {
                encryptCharArray[i] = Character.codePointAt(inputCharArray, i) + key <= 122 ?
                        (char)(inputCharArray[i] + key) : (char)(inputCharArray[i] + key - 26);
            } else {
                encryptCharArray[i] = inputCharArray[i];
            }
        }
        return encryptCharArray;
    }

    @Override
    public char[] decrypt(String data, int key) {
        char[] inputCharArray = data.toCharArray();
        char[] decryptCharArray = new char[inputCharArray.length];
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] >= 65 && inputCharArray[i] <= 90) {
                decryptCharArray[i] = Character.codePointAt(inputCharArray, i) - key >= 65 ?
                        (char)(inputCharArray[i] - key) : (char)(inputCharArray[i] - key + 26);
            } else if (inputCharArray[i] >= 97 && inputCharArray[i] <= 122) {
                decryptCharArray[i] = Character.codePointAt(inputCharArray, i) - key >= 97 ?
                        (char)(inputCharArray[i] - key) : (char)(inputCharArray[i] - key + 26);
            } else {
                decryptCharArray[i] = inputCharArray[i];
            }
        }
        return decryptCharArray;
    }
}
