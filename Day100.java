import java.util.Scanner;
public class day100 {
    static int n;
    static int[] x;  
    static int[] newArray;  
    
    static int retas(int[] arr) {
        n = arr.length;
        x = arr.clone();
        newArray = new int[n];

        boolean[] isOccupied = new boolean[n];
        int totalShift = 0; // p
        for (int i = 0; i < n; i++) {
            int elem = arr[i];
            int pos = elem % n;
            int shiftCount = 0;
            
            while (isOccupied[pos]) {
                pos = (pos + 1) % n;
                shiftCount++;
            }
            newArray[pos] = elem;
            isOccupied[pos] = true;
            totalShift += shiftCount;
        }

        return totalShift;
    }
    static String susunKode(int p) {
        StringBuilder kode = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int idx = (p + i) % n;
            kode.append(newArray[idx]);
        }return kode.toString();
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan panjang n : ");
        n = sc.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        int p = retas(inputArray);
        String kodeSandi = susunKode(p);
        System.out.println("susunan kode sandi :");
        System.out.println(kodeSandi);
    }
              }
