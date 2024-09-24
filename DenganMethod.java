public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 3000000;
        int tunjanganMakan = 3000000;
        int bonus = 1000000;

        int totalPenghasilan = hitungTotalPenghasilan(gaji pokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilakanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }

}


