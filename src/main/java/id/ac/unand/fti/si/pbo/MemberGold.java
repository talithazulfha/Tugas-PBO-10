package id.ac.unand.fti.si.pbo;

//Kelas keanggotaan Gold, mengekstensi kelas Member dan mengimplementasikan interface CanGetDiskon, CanRequestCicilan, CanRequestDelivery
public class MemberGold extends Member implements CanGetDiskon, CanRequestCicilan, CanRequestDelivery{
    
    public MemberGold (){
        super();
    }
    

    @Override
    //perhitungan total pembayaran dengan diskon dan bonus poin untuk member gold
    public Integer hitungTotalBayar (Integer totalBelanja){
        if (totalBelanja < 500000){
            totalBelanja = totalBelanja - totalBelanja*0/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 1000000){
            totalBelanja = totalBelanja - totalBelanja*2/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 7000000){
            totalBelanja = totalBelanja - totalBelanja*4/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja > 7000000){
            totalBelanja = totalBelanja - totalBelanja*6/100;
            poin += totalBelanja /10000;
        }
        return totalBelanja;
    }

    @Override
    //perhitungan biaya pengiriman untuk member gold
    public Double hitungOngkir (Double jarakTujuan){
        double ongkir = 0.0;
        if (jarakTujuan < 7){
            ongkir = 0;
        }
        else if (jarakTujuan >= 7){
            ongkir = 1000*(Math.ceil(jarakTujuan)-7);
        }
        return ongkir;
    }
    
    @Override 
    //perhitungan pembayaran cicilan untuk member gold
    public Integer hitungCicilanPerBulan (Integer totalBelanja, Integer jumlahBulan){
        jumlahBulan = 24;
        if (totalBelanja > 5000000){
            return totalBelanja / jumlahBulan;
        }
        return 0;
    }
    
}
