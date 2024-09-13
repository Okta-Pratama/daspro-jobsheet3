import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        int jamKerja;
        int upahPerJam;
        double totalGaji, bonus, pajak, gajiBersih;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextInt();

        System.out.print("Masukkan upah per jam (Rp): ");
        upahPerJam = input.nextInt();

        totalGaji = jamKerja * upahPerJam;

        bonus = 0.10 * totalGaji;

        pajak = 0.05 * (totalGaji + bonus);

        gajiBersih = totalGaji + bonus - pajak;

        System.out.println("Total Gaji sebelum bonus: Rp " + totalGaji);
        System.out.println("Bonus (10%): Rp " + bonus);
        System.out.println("Pajak (5%): Rp " + pajak);
        System.out.println("Gaji bersih setelah pajak: Rp " + gajiBersih);

        input.close();
    }
}
