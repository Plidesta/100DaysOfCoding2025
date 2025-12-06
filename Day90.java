public class main {
    public int kali(int a, int b){
        return a * b;
    }public String kata(String oke){
        return oke;
    }public static void main(String[]args){
        day90 isc = new day90();
        int hasil = isc.kali(10,100);
        String kt = isc.kata("saya buta coding");
        
        
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("hasil dari 10 × 100 = "+hasil);
        System.out.println(kt);
        System.out.println("");
        System.out.println("-------------------------");
    }
    
    }
