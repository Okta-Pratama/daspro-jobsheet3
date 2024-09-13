import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        int kWh;
        int tarifPerKWh = 1500;
        int totalTagihan;
        boolean penggunaanBerlebih;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan penggunaan listrik (kWh): ");
        kWh = inputScanner.nextInt();

        totalTagihan = kWh * tarifPerKWh;

        penggunaanBerlebih = kWh > 500;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan listrik melebihi 500 kWh: " + penggunaanBerlebih);

        inputScanner.close();
    }
}
