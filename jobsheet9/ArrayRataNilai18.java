    package jobsheet9;
    import java.util.Scanner;
    public class ArrayRataNilai18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jumlah mahasiswa : ");
            int jumlahMhs= sc.nextInt();
            int[] nilaiMhs = new int[jumlahMhs];
            double totalLulus = 0;
            double totalTdkLulus = 0;
            double rata2Lulus, rata2TdkLulus;
            int mhsLulus = 0, mhsTdkLulus = 0;

            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" +i +" : ");
                nilaiMhs[i] = sc.nextInt();
            }
            for (int i = 0; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > 70 ) {
                    totalLulus += nilaiMhs[i];
                    mhsLulus++;
                } else {
                    totalTdkLulus += nilaiMhs[i];
                    mhsTdkLulus++;
                }
            }
            rata2Lulus = totalLulus/mhsLulus;
            rata2TdkLulus = totalTdkLulus/mhsTdkLulus;
            System.out.println("Mahasiswa yang lulus = " +mhsLulus);
            System.out.println("Mahasiswa yang tidak lulus =  " +mhsTdkLulus);
            System.out.println("Rata-rata nilai = " +rata2Lulus);
            System.out.println("Rata-rata nilai = " +rata2TdkLulus);
        }
    }
