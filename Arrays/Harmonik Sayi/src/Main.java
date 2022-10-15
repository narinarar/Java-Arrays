public class Main {
    public static void main(String[] args) {

        double harmonic = 0;

        int [] list = {1, 2, 3, 7, 12, 16};

        //for-each döngüsü
        for (double i : list) {
            harmonic += (1 / i);
        }

        harmonic = list.length / harmonic;
        System.out.println(harmonic);

    }
}