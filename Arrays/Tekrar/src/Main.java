public class Main {
    public static void main(String[] args) {

        int sayac = 0;

        int[] dizi = {10, 20, 20, 10, 10, 20, 20, 5, 5, 5};
        int[] frekans = new int[dizi.length];


        for (int i = 0; i < dizi.length; i++)
            frekans[i] = 1;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                   dizi[j] = 0;
                }
            }
        }
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < dizi.length; i++) {
            if (frekans[i] > 1) {
                if (dizi[i] != 0)

                    System.out.println(dizi[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
            }
        }
    }
}
