package jobsheet12;
import java.util.Scanner;
public class Kubus18 {
    static int volumeKubus(int sisi) {
        return sisi * sisi * sisi;    
    }
    static int luasPermukaanKubus(int sisi) {
        return 6 * (sisi * sisi); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: " );
        int sisi = sc.nextInt();
        System.out.println("Volume kubus: " + volumeKubus(sisi));
        System.out.println("Luas permukaan kubus: " + luasPermukaanKubus(sisi));
    }
}
