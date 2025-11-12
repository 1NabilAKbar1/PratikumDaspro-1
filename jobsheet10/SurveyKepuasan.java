package jobsheet10;
import java.util.Scanner;
public class SurveyKepuasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Responden: ");
        int jmlResponden = sc.nextInt();
        System.out.print("Masukkan jumlah pertanyaan: ");
        int jmlPertanyaan = sc.nextInt();
        int[][] survey = new int[jmlResponden][jmlPertanyaan];
        double totResponden, totPertanyaan = 0, totSeluruh;
        double rataResponden, rataPertanyaan, rataSeluruh;
        totSeluruh = 0;
        System.out.println("=== INPUT HASIL SURVEY ===");
        for (int i = 0; i < jmlResponden; i++) {
            System.out.println("Responden ke-" +(i+1));
            for (int j = 0; j < jmlPertanyaan; j++) {
            System.out.print("Masukkan nilai pertanyaan " +(j+1) +"(dari 1-5): ");
            survey[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");
        for (int i = 0; i < jmlResponden; i++) {
            totResponden = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                totResponden += survey[i][j];
            }
            rataResponden = totResponden/jmlPertanyaan;
            System.out.println("Responden ke-" +(i+1) +": " +rataResponden);
        }
    
        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
        for (int j = 0; j < jmlPertanyaan; j++) {
            totPertanyaan = 0;
            for (int i = 0; i < jmlResponden; i++) {
                totPertanyaan += survey[i][j];
            }
            rataPertanyaan = totPertanyaan/jmlResponden;
            System.out.println("Pertanyaan ke-" +(j+1) +": " +rataPertanyaan);
        }

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        totResponden = 0;
        for (int i = 0; i < jmlResponden; i++ ) {
            for (int j = 0; j < jmlPertanyaan; j++ ) {
                totSeluruh += survey[i][j];
            }
        }
        rataSeluruh = totSeluruh / (jmlPertanyaan*jmlResponden);
        System.out.println("Nilai rata-rata keseluruhan: " +rataSeluruh);
    }
}
