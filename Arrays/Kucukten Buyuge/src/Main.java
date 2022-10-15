import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s, n, gecici= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        n = scanner.nextInt();

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". elemani giriniz: " );
            temp[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temp[i] > temp[j]) {
                    gecici = temp[i];
                    temp[i] = temp[j];
                    temp[j] = gecici;
                }
            }
        }
        System.out.println("Küçükten büyüğe sıralanmış hali: " + Arrays.toString(temp));
    }
}
