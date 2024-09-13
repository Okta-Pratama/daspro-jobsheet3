import java.util.Scanner;

public class kafe22 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        float diskon = 0.10f;  // Diskon 10%
        double totalHarga, nominalBayar;

        // Input keanggotaan
        System.out.print("Apakah pelanggan adalah anggota? (true/false): ");
        keanggotaan = input.nextBoolean();
        
        // Input jumlah pembelian
        System.out.print("Masukkan jumlah kopi yang dibeli: ");
        jmlKopi = input.nextInt();
        
        System.out.print("Masukkan jumlah teh yang dibeli: ");
        jmlTeh = input.nextInt();
        
        System.out.print("Masukkan jumlah roti yang dibeli: ");
        jmlRoti = input.nextInt();

        // Menghitung total harga
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        // Menghitung nominal bayar dengan diskon
        nominalBayar = totalHarga - (diskon * totalHarga);

        // Output hasil
        System.out.println("Keanggotaan Pelanggan " + keanggotaan);
        System.out.println("Item Pembelian " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti,");
        System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Nominal yang harus dibayar: Rp " + nominalBayar);

        // Menutup scanner
        input.close();
    }
}
