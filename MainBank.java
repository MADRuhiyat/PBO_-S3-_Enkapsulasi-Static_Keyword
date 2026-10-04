
public class MainBank {

    public static void main(String[] args) {

        System.out.println("SISTEM REKENING BANK");
        System.out.println("=============================================");

        RekeningBank rekening1 = new RekeningBank("1234567890", "MAD", 100000);
        RekeningBank rekening2 = new RekeningBank("9876543210", "PIO", 200000);
        RekeningBank rekening3 = new RekeningBank("4567123908", "DIKI", 300000);
        RekeningBank rekening4 = new RekeningBank("7890125347", "HAMAM", 400000);
        System.out.println("=============================================");

        System.out.println("SALDO AWAL");

        System.out.println("Saldo MAD: " + rekening1.getSaldo());
        System.out.println("Saldo PIO: " + rekening2.getSaldo());
        System.out.println("Saldo DIKI: " + rekening3.getSaldo());
        System.out.println("Saldo HAMAM: " + rekening4.getSaldo());
        System.out.println("=============================================");

        System.out.println("TRANSFER");

        rekening1.transfer(50000, rekening2);
        rekening2.transfer(40000, rekening3);
        rekening3.transfer(30000, rekening4);
        rekening4.transfer(20000, rekening1);
        System.out.println("=============================================");

        System.out.println("SALDO SETELAH TRANSFER");

        System.out.println("Saldo MAD: " + rekening1.getSaldo());
        System.out.println("Saldo PIO: " + rekening2.getSaldo());
        System.out.println("Saldo DIKI: " + rekening3.getSaldo());
        System.out.println("Saldo HAMAM: " + rekening4.getSaldo());
        System.out.println("=============================================");

        System.out.println("TES TRANSFER GAGAL");

        rekening1.transfer(200000, rekening2);
        System.out.println("=============================================");

        System.out.println("TOTAL REKENING");
        System.out.println("Total Rekening yang Dibuat " + RekeningBank.totalRekening);
        System.out.println("=============================================");
    }
}
