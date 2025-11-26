package jobsheet12;
import java.util.Scanner;
public class Kafe18 {
    public static void Menu(String namaPelanggan, boolean isMember){
        System.out.println("Selamat Datang, " +namaPelanggan);
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");

    }

    public static int hitungTotalHarga18 (int pilihMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihMenu - 1] * banyakItem;
        int hargaDiskon;

         if (kodePromo.equals("DISKON50")) {
            System.out.println("Promo berlaku, anda mendapatkan diskon 50%!");
            hargaDiskon = hargaTotal * 50 / 100;
            hargaTotal = hargaTotal - hargaDiskon;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Promo berlaku, anda mendapatkan diskon 30%!");
            hargaDiskon = hargaTotal * 30 / 100;
            hargaTotal = hargaTotal - hargaDiskon;
        } else {
            System.out.println("Kode tidak valid!");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int totalKeseluruhan = 0;
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (ketik 0 jika sudah): ");
            int pilihMenu = sc.nextInt();

            if (pilihMenu == 0) {
                break;
            }
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int hargaTotal = hitungTotalHarga18(pilihMenu, banyakItem,kodePromo);
            totalKeseluruhan = totalKeseluruhan + hargaTotal;
        }

        System.out.println("Total harga untuk pesanan Anda: Rp " +totalKeseluruhan);
    }
}


