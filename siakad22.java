import java.util.Scanner;

public class siakad22 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiAkhir, nilaiUAS;

        // sc data mahasiswa
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        // sc nilai kuis, tugas, dan ujian
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        // Menghitung nilai akhir
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);



        // Output nilai akhir
        System.out.print("Mahasiswa Dengan Nama : " + nama + ", Nim :( " + nim +")");
        System.out.println(" Kelas: " + kelas + " Nomor Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // Menutup scanner
        sc.close();
    }
}
