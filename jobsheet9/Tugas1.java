package jobsheet9;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa yang akan diinput: ");
        int banyakMhs = sc.nextInt();
        int[] nilaiMhs = new int[banyakMhs];
        int jmlNilai = 0;
        double rataRata;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1) +" : ");
            nilaiMhs[i] = sc.nextInt();
            jmlNilai += nilaiMhs[i];
        }
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int n : nilaiMhs) {
            if (n > tertinggi) {
                tertinggi = n;
            } if (n < terendah) {
                terendah = n;
            }
        }
        rataRata = jmlNilai/ nilaiMhs.length;
        System.out.println("\nDaftar nilai Mahasiswa: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Mahasiswa ke-" +(i+1) +" : " +nilaiMhs[i]);
        }
        System.out.println("Nilai rata-rata = " +rataRata);
        System.out.println("Nilai tertinggi = " +tertinggi);
        System.out.println("Nilai terendah = " +terendah);
    }
}
