import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("List: " + Arrays.toString(list));

        int minNearest = list[0];
        int maxNearest = list[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        Arrays.sort(list);
        for( int i : list) {
            if (i < number) {
                minNearest = i;
            }
            if (i > number) {
                maxNearest = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxNearest);





    }
}