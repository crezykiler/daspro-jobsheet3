import java.util.Scanner;

public class Siakad17 {

    public static void main(String[] args) {
        Scanner Mulyono = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = mulyono.nextLine();
        System.out.print("Masukkan nim: ");
        nim = mulyono.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = mulyono.nextLine();
        System.out.print("Masukkan absen: ");
        absen = mulyonoc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = mulyono.nextLine();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = mulyono.nextLine();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = mulyono.nextLine();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + "NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}