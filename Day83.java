public class main {
    public static void main(String[] args) {
        int[]angka = {5, 12, 8, 20, 15};
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total +=angka[i]; 
        }
        System.out.println("Total penjumlahan array: " + total);
    }
}
