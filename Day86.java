public class main {
    public static void main(String[] args) {
        int[] bilGanjil = {5, 7, 31, 15, 99, 77};
        int min = bilGanjil[0];

        for (int i = 1; i < bilGanjil.length; i++) {
            if (bilGanjil[i] < min) {
                min = bilGanjil[i];
            }
        }
        System.out.println("Nilai Minimal array = " + min);
    }
}
