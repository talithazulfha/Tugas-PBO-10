package id.ac.unand.fti.si.pbo;

//Kelas keanggotaan Platinum, mengekstensi kelas Member dan mengimplementasikan interface CanGetDiskon, CanRequestCicilan, CanRequestDelivery, CanDeposit
public class MemberPlatinum extends Member implements CanGetDiskon, CanRequestDelivery, CanRequestCicilan, CanDeposit{
    private Integer saldo = 0;
    
    public MemberPlatinum (){
        super();
    }

    @Override
    //perhitungan total pembayaran dengan diskon dan bonus poin untuk member Platinum
    public Integer hitungTotalBayar (Integer totalBelanja){
        if (totalBelanja < 500000){
            totalBelanja = totalBelanja - totalBelanja*0/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 1000000){
            totalBelanja = totalBelanja - totalBelanja*3/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 7000000){
            totalBelanja = totalBelanja - totalBelanja*5/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 10000000){
            totalBelanja = totalBelanja - (int) Math.floor(totalBelanja*0.070000125);
            poin += totalBelanja /10000;
        }
        else if (totalBelanja > 10000000){
            totalBelanja = totalBelanja - (int) Math.floor(totalBelanja*0.07);
            poin += totalBelanja /10000;
        }
        return totalBelanja;
    }

    @Override
    //perhitungan biaya pengiriman untuk member Platinum
    public Double hitungOngkir (Double jarakTujuan){
        double ongkir = 0.0;
        if (jarakTujuan < 10){
            ongkir = 0;
        }
        else if (jarakTujuan >= 7){
            ongkir = 1000*(Math.ceil(jarakTujuan)-10);
        }
        return ongkir;
    }
    
    @Override 
    //perhitungan pembayaran cicilan untuk member Platinum
    public Integer hitungCicilanPerBulan (Integer totalBelanja, Integer jumlahBulan){
        jumlahBulan = 12;
        if (totalBelanja > 2500000){
            return totalBelanja/jumlahBulan;
        }
        return 0;
    }

    @Override
    //metode deposito utk member Platinum
    public Integer deposit (Integer jumlahDeposit){
        this.saldo += jumlahDeposit;
        return saldo;
    }
    //metode penarikan tunai utk anggota Platinum
    public Integer tarikTunai (Integer jumlahTarikTunai){
        this.saldo -= jumlahTarikTunai;
        return saldo;
    }
    //metode cek saldo utk member Platinum
    public Integer cekSaldo (){
        return saldo;
    }
    
}
