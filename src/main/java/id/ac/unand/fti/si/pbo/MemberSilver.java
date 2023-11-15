package id.ac.unand.fti.si.pbo;

//Kelas keanggotaan Platinum, mengekstensi kelas Member dan mengimplementasikan interface CanGetDiskon, CanRequestDelivery
public class MemberSilver extends Member implements CanGetDiskon, CanRequestDelivery {

    public MemberSilver(){
        super();
    }
    
    public Integer getPoin(){
        return poin;
    }

    //perhitungan bonus poin yg berbeda utk member Silver
    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }

    @Override
    //perhitungan total pembayaran dengan diskon dan bonus poin utk member Silver
    public Integer hitungTotalBayar (Integer totalBelanja){
        if (totalBelanja < 500000){
            totalBelanja = totalBelanja - totalBelanja*0/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 1000000){
            totalBelanja = totalBelanja - totalBelanja*1/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 7000000){
            totalBelanja = totalBelanja - totalBelanja*3/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja > 7000000){
            totalBelanja = totalBelanja - totalBelanja*5/100;
            poin += totalBelanja /10000;
        }
        return totalBelanja;
    }

    @Override
    //perhitungan biaya pengiriman utk member Silver
    public Double hitungOngkir (Double jarakTujuan){
        double ongkir = 0.0;
        if (jarakTujuan < 5){
            ongkir = 0;
        }
        else if (jarakTujuan >= 5){
            ongkir = 1500*(Math.ceil(jarakTujuan)-5);
        }
        return ongkir;
    }

}
