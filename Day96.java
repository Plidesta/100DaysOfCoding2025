public class main {
    public static int penjumlahan(int angka1, int angka2){
        int hasil = angka1 + angka2;
        return hasil;
    }public static int pengurangan(int angka1, int angka2){
        int hasil2 = angka1 - angka2;
        return hasil2;
    }
    public static int perkalian(int angka1, int angka2){
        int hasil3 = angka1 * angka2;
        return hasil3;
    }
    public static double pembagian(double angka3, double angka4){
        double hasil4 = angka3 / angka4;
        return hasil4;
    }
    public static void main(String[] args) {
        System.out.println("OPERATOR ARITMATIKA");
        System.out.println("===========================");
        System.out.println("");
        int total = penjumlahan(6, 90);
        System.out.println("hasil dari 6 + 90 = "+total);
        int total1 = pengurangan(6, 90);
        System.out.println("hasil dari 6 - 90 = "+total1);
        int total2= perkalian(6, 90);
        System.out.println("hasil dari 6 × 90 = "+total2);
        double total3 = pembagian(50, 99 );
        System.out.println("hasil dari 6 / 90 = "+total3);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        
    }
    
          }
