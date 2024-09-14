import java.util.Scanner;

public class Gaji17 {
    public static void main(String[] args) {
        Scanner Penghasilan = new Scanner(System.in);

         // Deklarasi variabel
        int jamKerja; 
        double upah, totalUpah, totalGajiAkhir, bonus, totalBonus, pajak, jumlahBonus, jumlahPajak;

         // Input dari pengguna
        System.out.print("Masukkan jam Kerja = ");
        jamKerja = Penghasilan.nextInt();
        System.out.print("Masukkan upah = ");
        upah = Penghasilan.nextDouble();

         // Persentase bonus dan pajak
        pajak = 0.05;
        bonus = 0.10;

        //Proses
        totalUpah = jamKerja * upah ; 
        totalBonus = totalUpah * bonus;
        jumlahBonus = totalUpah + totalBonus;
        jumlahPajak = jumlahBonus * pajak;
        totalGajiAkhir = totalUpah + totalBonus - jumlahPajak; 

         // Output hasil perhitungan
        System.out.println("Gaji Karyawan tanpa bonus dan pajak = " + totalUpah);
        System.out.println("Bonus = " + totalBonus);
        System.out.println("Pajak = " + jumlahPajak);
        System.out.println("Gaji + Bonus + Pajak = " + totalGajiAkhir);
        }
}
