public class main {
    public static void mencariElemen(int[]array, int target) {
        boolean cari = false;
        
        System.out.println("pencarian nilai: " + target);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Elemen " + target + " ditemukan pada indeks: " + i);
                cari = true;
               
                return; 
            }
        }
        if (!cari) {
            System.out.println("Elemen " + target + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        int[] data = {15, 23, 8, 42, 10, 31};
        mencariElemen(data, 42); 
        mencariElemen(data, 1);
        System.out.println("---");
        
    }
}
