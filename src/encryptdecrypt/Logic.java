package encryptdecrypt;

import java.io.IOException;

class Logic {

    static void logic(String mode, int key, String data, String in, String out, String alg) {

        switch (mode) {

            case "enc":
                if (Main.isInExists()) {
                    try {
                        data = FileManager.readFileAsString(in);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                CryptAlgorithmClient encryptAlgorithm = new CryptAlgorithmClient();
                char[] cryptCharArray;
                if (alg.equals("unicode")) {
                    encryptAlgorithm.setAlgorithm(new UnicodeAlgorithm());
                } else {
                    encryptAlgorithm.setAlgorithm(new ShiftAlgorithm());
                }
                cryptCharArray = encryptAlgorithm.encrypt(data, key);

                if (Main.isOutExists()) {
                    FileManager.writeFile(cryptCharArray, out);
                } else {
                    System.out.println(cryptCharArray);
                }
                break;

            case "dec":
                if (Main.isInExists()) {
                    try {
                        data = FileManager.readFileAsString(in);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                CryptAlgorithmClient decryptAlgorithm = new CryptAlgorithmClient();
                char[] decryptCharArray;
                if (alg.equals("unicode")) {
                    decryptAlgorithm.setAlgorithm(new UnicodeAlgorithm());
                } else {
                    decryptAlgorithm.setAlgorithm(new ShiftAlgorithm());
                }
                decryptCharArray = decryptAlgorithm.decrypt(data, key);

                if (Main.isOutExists()) {
                    FileManager.writeFile(decryptCharArray, out);
                } else {
                    System.out.println(decryptCharArray);
                }
                break;

            default:
                System.out.println("Wrong command line argument mode...");
                break;
        }
    }
}
