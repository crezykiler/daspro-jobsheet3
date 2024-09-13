import java.util.Scanner;

public class Siakad17 {

    public static void main(String[] args) {
        Scanner Mulyono = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = Mulyono.nextLine();
        System.out.println("Masukkan nim: ");
        nim = Mulyono.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = Mulyono.nextLine();
        System.out.print("Masukkan absen: ");
        absen = Mulyono.nextByte();

        System.out.print("Masukkan nilai kuis: " );
        nilaiKuis = Mulyono.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = Mulyono.nextDouble();
        System.out.print("Masukkan nilai uts: ");
        nilaiUts = Mulyono.nextDouble();
        System.out.print("Masukkan nilai uas: ");
        nilaiUas = Mulyono.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nilaiUas * 0.35);

        System.out.println("Nama: " + nama + "NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}