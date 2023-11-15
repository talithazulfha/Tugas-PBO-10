package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        // Membuat instance dari MemberGold
        MemberGold goldMember = new MemberGold();
        int totalBelanjaGold = 8000000;
        int cicilanGold = goldMember.hitungCicilanPerBulan(totalBelanjaGold, 24);
        double ongkirGold = goldMember.hitungOngkir(10.0);
        int totalBayarGold = goldMember.hitungTotalBayar(totalBelanjaGold);

        // Output untuk MemberGold
        System.out.println("Member Gold:");
        System.out.println("Total Belanja: " + totalBelanjaGold);
        System.out.println("Cicilan per Bulan: " + cicilanGold);
        System.out.println("Ongkir: " + ongkirGold);
        System.out.println("Total Bayar: " + totalBayarGold);
        System.out.println("Poin: " + goldMember.getPoin());

        // Membuat instance dari MemberPlatinum
        MemberPlatinum platinumMember = new MemberPlatinum();
        int totalBelanjaPlatinum = 12000000;
        int cicilanPlatinum = platinumMember.hitungCicilanPerBulan(totalBelanjaPlatinum, 12);
        double ongkirPlatinum = platinumMember.hitungOngkir(15.0);
        int totalBayarPlatinum = platinumMember.hitungTotalBayar(totalBelanjaPlatinum);
        int depositAmount = 500000;
        int depositedAmount = platinumMember.deposit(depositAmount);

        // Output dari MemberPlatinum
        System.out.println("\nMember Platinum:");
        System.out.println("Total Belanja: " + totalBelanjaPlatinum);
        System.out.println("Cicilan per Bulan: " + cicilanPlatinum);
        System.out.println("Ongkir: " + ongkirPlatinum);
        System.out.println("Total Bayar: " + totalBayarPlatinum);
        System.out.println("Deposited Amount: " + depositedAmount);
        System.out.println("Poin: " + platinumMember.getPoin());
        System.out.println("Saldo: " + platinumMember.cekSaldo());

        // Membuat instance dari MemberSilver
        MemberSilver silverMember = new MemberSilver();
        int totalBelanjaSilver = 6000000;
        double ongkirSilver = silverMember.hitungOngkir(8.0);
        int totalBayarSilver = silverMember.hitungTotalBayar(totalBelanjaSilver);

        // Output dari MemberSilver
        System.out.println("\nMember Silver:");
        System.out.println("Total Belanja: " + totalBelanjaSilver);
        System.out.println("Ongkir: " + ongkirSilver);
        System.out.println("Total Bayar: " + totalBayarSilver);
        System.out.println("Poin: " + silverMember.getPoin());
    }
}