package jobsheet6;

import java.net.Socket;
import java.util.Scanner;
public class lulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==== INPUT DATA MAHASISWA====");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String NIM = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman---");
        System.out.print("Nilai UTS : ");
        double nilaiUTS1 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUAS1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas1 = sc.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data---");
        System.out.print("Nilai UTS : ");
        double nilaiUTS2 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUAS2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas2 = sc.nextDouble();
        

        double nilaiAkhir1 = (nilaiUTS1 * 0.3) + (nilaiUAS1 * 0.4) + (nilaiTugas1 * 0.3);
        double nilaiAkhir2 = (nilaiUTS2 * 0.3) + (nilaiUAS2 * 0.4) + (nilaiTugas2 * 0.3);

        String statusNilai1;
        String statusNilai2;
        statusNilai1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        statusNilai2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        String hurufNilai1;
        if (nilaiAkhir1 > 80) {
            hurufNilai1 = "A";
        } else if (nilaiAkhir1 > 73 ) {
            hurufNilai1 = "B+";
        } else if (nilaiAkhir1 > 65) {
            hurufNilai1 = "B";
        } else if (nilaiAkhir1 > 60) {
            hurufNilai1 = "C+";
        } else if (nilaiAkhir1 > 50) {
            hurufNilai1 = "C";
        } else if (nilaiAkhir1 > 39) {
            hurufNilai1 = "D";
        } else {
            hurufNilai1 = "E";
        }

        String hurufNilai2;
        if (nilaiAkhir2 > 80) {
            hurufNilai2 = "A";
        } else if (nilaiAkhir2 > 73 ) {
            hurufNilai2 = "B+";
        } else if (nilaiAkhir2 > 65) {
            hurufNilai2 = "B";
        } else if (nilaiAkhir2 > 60) {
            hurufNilai2 = "C+";
        } else if (nilaiAkhir2 > 50) {
            hurufNilai2 = "C";
        } else if (nilaiAkhir2 > 39) {
            hurufNilai2 = "D";
        } else {
            hurufNilai2 = "E";
        }

        double rata_rata = (nilaiAkhir1 + nilaiAkhir2) /2 ;
        String statusSemester;
        if (statusNilai1.equals("LULUS")&& statusNilai2.equals("LULUS")) {
            if (rata_rata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata dibawah 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (SALAH SATU MATA KULIAH TIDAK LULUS)";
        } 

        System.out.println("\n================= HASIL PENILAIAN AKADEMIK =================");
        System.out.println("NAMA : " +nama);
        System.out.println("NIM :" +NIM);
        System.out.println("\nMATA KULIAH 1: Algortima Pemrograman");
        System.out.println("UTS : " +nilaiUTS1);
        System.out.println("UAS : " +nilaiUAS1);
        System.out.println("Tugas : " +nilaiTugas1);
        System.out.println("Nilai Akhir : " +nilaiAkhir1);
        System.out.println("Nilai Huruf : " +hurufNilai1);
        System.out.println("Status : " +statusNilai1);
        System.out.println("\nMATA KULIAH 2: Struktur Data");
        System.out.println("UTS : " +nilaiUTS2);
        System.out.println("UAS : " +nilaiUAS2);
        System.out.println("Tugas : " +nilaiTugas2);
        System.out.println("Nilai Akhir : " +nilaiAkhir2);
        System.out.println("Nilai Huruf : " +hurufNilai2);
        System.out.println("Status : " +statusNilai2);
        System.out.println("\nRata-rata Nilai : " +rata_rata);
        System.out.println("Status Semester : " +statusSemester);
    }
}
