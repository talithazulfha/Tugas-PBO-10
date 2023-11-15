package id.ac.unand.fti.si.pbo;

//Interface untuk deposito dan transaksi keuangan
public interface CanDeposit {
    public Integer deposit (Integer jumlahDeposit);
    public Integer tarikTunai (Integer jumlahTarikTunai);
    public Integer cekSaldo();
}
