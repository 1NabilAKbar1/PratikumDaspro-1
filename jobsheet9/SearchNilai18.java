package jobsheet9;
import java.util.Scanner;
public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinputkan: ");
        int jmlMahasiswa = sc.nextInt();
        int [] arrNilai = new int[jmlMahasiswa];
        int key;
        int hasil = 0;
        
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1) +" : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = (i+1);
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai " +key +" ketemu, merupakan mahasiswa ke-" +hasil);
        System.out.println();
    }
}
