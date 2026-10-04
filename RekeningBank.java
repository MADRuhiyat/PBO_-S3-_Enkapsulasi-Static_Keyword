
public class RekeningBank {

    private String noRekening;
    private String namaPemilik;
    private double saldo;

    public static int totalRekening = 0;

    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {

        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

        if (saldoAwal >= 50000) {
            this.saldo = saldoAwal;
        } else {
            System.out.println(
                    "ERROR: Saldo Awal " + namaPemilik + " kurang dari 50.000"
            );
            this.saldo = 0;
        }
        totalRekening++;
    }

    public RekeningBank() {
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println(
                    "ERROR: Saldo tidak boleh Negatif"
            );
        }
    }

    public void transfer(double nominal, RekeningBank tujuan) {

        if (nominal <= 0) {
            System.out.println(
                    "ERROR: Transfer Gagal, Nominal Transfer harus lebih dari 0"
            );
            return;
        }
        
        if (nominal > this.saldo) {
            System.out.println(
                    "ERROR: Transfer Gagal Saldo tidak Mencukupi"
            );
            return;
        }

        this.saldo -= nominal;
        tujuan.saldo += nominal;

        System.out.println(
                "Transfer Rp." + nominal + " Berhasil"
        );
    }
}
