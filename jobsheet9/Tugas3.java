package jobsheet9;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};   
  
        
        System.out.println(" === Daftar Menu Cafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) +"." +menu[i]);
        }

        System.out.print("\nMasukkan makanan/minuman yang ingin dicari: ");
        String makanan = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makanan)) {
                System.out.println("Menu " +makanan+" tersedia di cafe" );
                break;
            } else {
                System.out.println("Menu " +makanan +" tidak tersedia di cafe");
                break;
            }
        }
    }
}
