public class main{
    public static void main(String[] args) {
        int[] bilGenap = {2, 8, 22, 10, 40, 6};
        int max = bilGenap[0];

        for (int i = 1; i < bilGenap.length; i++) {
            if (bilGenap[i] > max) {
                max = bilGenap[i];
            }
        }
        System.out.println("Nilai Maksimal array = " + max);
    }
}
