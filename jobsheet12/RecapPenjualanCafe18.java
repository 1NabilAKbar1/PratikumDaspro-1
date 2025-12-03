package jobsheet12;
import java.util.Scanner;
public class RecapPenjualanCafe18 {
    static void inputPenjualan(String[] menu, int[][] data, int jumlahMenu, int jumlahHari) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
        }
    }
    static void tampilPenjualan(String[] menu, int[][] data, int jumlahMenu, int jumlahHari) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void menuTertinggi(String[] menu, int[][] data, int jumlahMenu, int jumlahHari) {
        int maxTotal = -1;
        int indexMenu = -1;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\n=== MENU PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexMenu]);
        System.out.println("Total Penjualan: " + maxTotal);
    }
    static void rataRataPenjualan(String[] menu, int[][] data, int jumlahMenu, int jumlahHari) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += data[i][j];
            }
            double rata = (double) total / jumlahHari;
            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();
        String[] menu = new String[jumlahMenu];
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" +(i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        int[][] data = new int[jumlahMenu][jumlahHari];

        inputPenjualan(menu, data, jumlahMenu, jumlahHari);
        tampilPenjualan(menu, data, jumlahMenu, jumlahHari);
        menuTertinggi(menu, data, jumlahMenu, jumlahHari);
        rataRataPenjualan(menu, data, jumlahMenu, jumlahHari);
    }
}
