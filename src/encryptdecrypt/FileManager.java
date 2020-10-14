package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileManager {

    static String readFileAsString(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    static void writeFile(char[] cryptCharArray, String out) {
        File file = new File(out);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print(cryptCharArray);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}
