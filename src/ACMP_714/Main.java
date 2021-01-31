package ACMP_714;

public class Main {
    public static void main(String[] args) {
        char[] localArray = {'1', '2', '3'};

        int numberOfDigits = 0;

        for (int i = 0; i < localArray.length; i++) {
            if (isDigit(localArray[i])) {
                numberOfDigits ++;
            }
        }

        System.out.println(numberOfDigits);

    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
