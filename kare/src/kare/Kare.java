
package kare;


public class Kare {

    private int kenar;
    public void setKenar(int kenar) {
    this.kenar = kenar;
 }
    public int getKenar() {
    return kenar;
 }
    public int alanHesapla(){
    return kenar*kenar;
    //alan hesaplama kenar * kenar 
 }
    public int cevreHesapla(){
    return 4*kenar;
    //cevre heraplama 4 * kenar
 } 
    public static void main(String[] args) {
       Kare masa = new Kare();

        masa.setKenar(10);
        System.out.println("Masanın alanı:"+masa.alanHesapla());
        //yazdırma işlemi masanın alanı 
        System.out.println("masanın cevresi"+masa.cevreHesapla());
        // yazdırma işlemi masanın çevresi

    }
    
}
