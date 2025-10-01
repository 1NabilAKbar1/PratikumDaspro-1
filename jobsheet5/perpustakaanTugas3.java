package jobsheet5;
import java.util.Scanner;
public class perpustakaanTugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah kamu membawa kartu mahasiswa? (true/false): ");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah kamu sudah melakukan registrasi online? (true/false): ");
        boolean registrasi = sc.nextBoolean();

        if (kartuMahasiswa == true || registrasi == true) {
            System.out.println("Silahkan masuk");
        }
        else {
            System.out.println("Dilarang masuk");
        }
    }
}
