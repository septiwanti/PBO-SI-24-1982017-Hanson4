public class ContohParameterMethod {
    // method dengan satu parameter
    public static int kaliDua(int angka){
        int hasil = angka * 2;
        return hasil;
    }
    // method dengan beberapa parameter
    public static double hitungLuasSegitiga (double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        int hasilkaliDua = (angka:5); // memeanggil method dengan argumen 5
        System.out.println("5 *2");
    }
}
