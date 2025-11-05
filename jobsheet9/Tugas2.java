    package jobsheet9;
    import java.util.Scanner;
    public class Tugas2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jumlah pesanan: " );
            int jumlah = sc.nextInt();
            
            String[] namaPesanan = new String[jumlah];
            double[] hargaPesanan = new double[jumlah];
            double total = 0;
            
            sc.nextLine();
            for (int i = 0; i < jumlah; i++) {
                System.out.print("Masukkan nama makanan/minuman yang ingin dipesan: ");
                namaPesanan[i] = sc.nextLine();
                System.out.print("Masukkan harga " +namaPesanan[i] +" : ");
                hargaPesanan[i] = sc.nextDouble();
                total += hargaPesanan[i];
                sc.nextLine();
            }
            System.out.println(" \n=== Daftar Pesanan === ");
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i+1) +"." +namaPesanan[i] + "= Rp" +hargaPesanan[i]);
            }
            System.out.println("Total harga : " +total);

        }
    }
