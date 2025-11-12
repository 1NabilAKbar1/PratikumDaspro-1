package jobsheet10;
import java.util.Scanner;
public class SIAKAD18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlhMatkul = sc.nextInt();
        int [][] nilai = new int[jmlhMahasiswa][jmlhMatkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" +(i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " +totalPerSiswa/jmlhMatkul);
        }
        System.out.println( );
        for (int j = 0; j < jmlhMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jmlhMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " +(j+1) +": " +totalPerMatkul/jmlhMahasiswa);
        }
    }
}
