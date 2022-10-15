import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {3, 2, 4, 5, 9, 2, 4, 4, 8, 2, 5, 7, 8};
        int[] evenNumber = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (!isFind(evenNumber, list[i])) {
                        evenNumber[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        for (int value : evenNumber) {
            if ((value != 0) && (value % 2 != 1)) {
                System.out.println(value);
            }
        }
    }
}