package jobsheet12;
import java.util.Scanner;
public class RecapPenjualanCafe18 {
    static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
    static void inputPenjualan(int[][] data) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
        }
    }
    static void tampilPenjualan(int[][] data) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void menuTertinggi(int[][] data) {
        int maxTotal = -1;
        int indexMenu = -1;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) {
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
    static void rataRataPenjualan(int[][] data) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[0].length;
            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }
    public static void main(String[] args) {
        int jumlahMenu = 5;
        int jumlahHari = 7;

        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        inputPenjualan(penjualan);
        tampilPenjualan(penjualan);
        menuTertinggi(penjualan);
        rataRataPenjualan(penjualan);
    }
}
