package uts;
import java.util.Scanner;
public class UTSpart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prestasi;
        double IPK;

        System.out.print("Masukkan jumlah prestasi : ");
        prestasi = sc.nextInt();
        System.out.print("Masukkan IPK : " );
        IPK = sc.nextDouble();

        if (prestasi > 3 && IPK > 3.5) {
            System.out.println("Memenuhi menjadi Mahasiswa Berprestasi");
        } else {
            System.out.println("Belum memenuhi menjadi Mahasiswa berprestasi");
        }
    }
}
