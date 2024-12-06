import java.util.HashMap;
import java.util.Objects;

public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia="Nieopłacone";
    String platnosc;
    double kosztZamowienia;
    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy=koszykZakupowy;
        this.kosztZamowienia=koszykZakupowy.obliczCalkowitaWartosc();
    }
    public double getKosztZamowienia() {
        return kosztZamowienia;
    }
    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia= statusZamowienia;
    }
    public void ustawStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }
    public void finalizujZamowienie(){
        if(Objects.equals(platnosc, "Opłacone")){
            this.statusZamowienia = "Gotowe do wysyłki";
        }
    }
    public void wyswietlZamowienie(){
        System.out.println(this.koszykZakupowy.toString());
        System.out.println("Status: " + statusZamowienia);
    }
    public void zwrocProdukt(Produkt produkt, int ilosc){
        //sprawdzic czy aktualizuje sie kwota zamowienia - w koszyku kwota tak aktualizuje sie
        this.koszykZakupowy.usunProdukt(produkt,ilosc);
    }
}
