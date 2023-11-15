package id.ac.unand.fti.si.pbo;

//Kelas yang mewakili Member
public class Member {
    protected Integer poin = 0;
    
    public Integer getPoin(){
        return poin;
    }

    //metode utk menukarkan poin saat membeli souvenir
    public void redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
    }

    //Metode untuk menghirung bonus poin berdasarkan total pembayaran
    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }
}
