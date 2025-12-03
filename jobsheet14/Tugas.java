package jobsheet14;
import java.util.Scanner;
public class Tugas {
    static int hitungRekursif(int[] data, int index) {
        if (index == data.length) {
            return 0;
        } 
            return data[index] + hitungRekursif(data, index + 1);
        
    }
    static int hitungIteratif (int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang akan di hitung (N): ");
        int N = sc.nextInt();
        int[] angka = new int[N];
        for (int i = N - 1; i>= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = sc.nextInt();
            
        }
        int totalRekursif = hitungRekursif(angka, 0);
        int totalIteratif = hitungIteratif(angka);

        System.out.println("Total dengan rekursif: " +totalRekursif);
        System.out.println("Total dengan rekursif: " +totalIteratif);
    }

}
