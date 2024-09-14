import java.util.Scanner;

public class Listrik17 {

    public static void main(String[] args) {
        Scanner listrik = new Scanner(System.in);

        int tListrik = 1500; // Tarif listrik per kWh
        int jmlListrik, totalHarga;
        boolean sListrik; // Status apakah penggunaan listrik melebihi 500 kWh

        // Input jumlah penggunaan listrik
        System.out.print("Masukkan Jumlah Listrik (kWh): ");
        jmlListrik = listrik.nextInt();

        // Hitung total harga
        totalHarga = jmlListrik * tListrik;

        // Periksa apakah penggunaan listrik melebihi 500 kWh
        sListrik = jmlListrik > 500;

        // Output hasil
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Status Listrik (melebihi 500 kWh): " + sListrik);
    }
}
