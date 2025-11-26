package jobsheet12;
import java.util.Scanner;
public class NilaiMahasiswa18 {
    static void isianArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Input Nilai Mahasiswa ===");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
    
    static void tampilArray(int[] arr) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + arr[i]);
        }
    }
    
    static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();
        int[] nilaiMhs = new int[N];
        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Total nilai seluruh mahasiswa adalah: " + totalNilai);
    }
}