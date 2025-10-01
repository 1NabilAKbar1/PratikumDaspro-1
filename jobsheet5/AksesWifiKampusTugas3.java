package jobsheet5;
import java.util.Scanner;
public class AksesWifiKampusTugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SKS;
        System.out.println("Apakah kamu dosen atau mahasiswa? ");
        String pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan");
        }
        else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan SKS mahasiswa: ");
            SKS = sc.nextInt();
            if (SKS >=12) {
                System.out.println("Akses WiFi diberikan");
            }
            else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }

        }
        else {
            System.out.println("Pengguna tidak ditemukan");
        }
    }
   

}
