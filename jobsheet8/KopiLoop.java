package jobsheet8;
import java.util.Scanner;
public class KopiLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah cabang cafe : ");
        int cabangCafe = sc.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        int totalPelanggan = 0;
        int semuaItem = 0;
        for (int i = 1; i <= cabangCafe; i++){
            System.out.println("\n--- Cabang " +i +" ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            int totalItem = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " +j +" memesan item sebanyak " );
                int item = sc.nextInt();
                totalItem += item;
                
            }
            System.out.println("Cabang " +i +":");
            System.out.println("- Pelanggan: " +pelanggan);
            System.out.println("- Item terjual: " +totalItem);
            
            totalPelanggan += pelanggan;
            semuaItem += totalItem;
        }
        System.out.println("\nTotal Seluruh Cabang:");
        System.out.println("Pelanggan: " +totalPelanggan +" orang");
        System.out.println("Item terjual: " +semuaItem + " item");
    }
}
