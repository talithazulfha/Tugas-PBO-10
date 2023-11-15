package id.ac.unand.fti.si.pbo;

//Interface untuk menghitung pembayaran cicilan
public interface CanRequestCicilan {
    public Integer hitungCicilanPerBulan (Integer totalBelanja, Integer jumlahBulan);
}
