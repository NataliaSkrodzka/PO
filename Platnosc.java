public class Platnosc {
    double kwota;
    String statusPlatnosci;
    public Platnosc(Zamowienie zamowienie) {
        this.kwota = zamowienie.kosztZamowienia;
        this.statusPlatnosci = "Nieopłacone";
    }
    public void zaplac(Zamowienie zamowienie) {
        zamowienie.platnosc = "Opłacone";
        this.kwota = 0;
    }
}
