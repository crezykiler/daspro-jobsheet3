import java.util.Scanner;

public class Siakad17 {

    public static void main(String[] args) {
        Scanner Mulyono = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = Mulyono.nextLine();
        System.out.print("Masukkan nim: ");
        nim = Mulyono.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = Mulyono.nextLine().charAt(0);
        System.out.print("Masukkan absen: ");
        absen = Mulyono.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = Mulyono.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = Mulyono.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = Mulyono.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + "NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}