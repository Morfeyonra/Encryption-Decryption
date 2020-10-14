package encryptdecrypt;

public class Main {

    private static String mode = "enc";
    private static int key = 0;
    private static String data = "";
    private static boolean dataExists = false;
    private static String in = ".input.txt";
    private static boolean inExists = false;
    private static String out = ".output.txt";
    private static boolean outExists = false;
    private static String alg = "shift";

    /*public static boolean isDataExists() {
        return dataExists;
    }*/
    public static boolean isInExists() {
        return inExists;
    }
    public static boolean isOutExists() {
        return outExists;
    }


    public static void main(String[] args) {
        parseCMDArguments(args);
        Logic.logic(mode, key, data, in, out, alg);
    }


    private static void parseCMDArguments(String[] args) {

        for (int i = 0; i < args.length; i++) {

            if (args[i].equals("-mode")) {
               try {
                   mode = args[i + 1];
               } catch (Exception e) {
                   System.out.println("Wrong command line args...");
               }
            }

            if (args[i].equals("-key")) {
                try {
                    key = Integer.parseInt(args[i + 1]);
                } catch (Exception e) {
                    System.out.println("Wrong command line args...");
                }
            }

            if (args[i].equals("-data")) {
                try {
                    data = args[i + 1];
                } catch (Exception e) {
                    System.out.println("Wrong command line args...");
                }
                dataExists = true;
            }

            if (args[i].equals("-out")) {
                try {
                    out = args[i + 1];
                } catch (Exception e) {
                    System.out.println("Wrong command line args...");
                }
                outExists = true;
            }

            if (args[i].equals("-alg")) {
                try {
                    alg = args[i + 1];
                } catch (Exception e) {
                    System.out.println("Wrong command line args...");
                }
            }
        }

        if (!dataExists) {

            for (int i = 0; i < args.length; i++) {

                if (args[i].equals("-in")) {
                    try {
                        in = args[i + 1];
                    } catch (Exception e) {
                        System.out.println("Wrong command line args...");
                    }
                    inExists = true;
                }
            }
        }
    }
}
