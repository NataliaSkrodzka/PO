import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    Adres adres;
    ArrayList<Zamowienie> listaZamowien;
    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.listaZamowien = new ArrayList<>();
    }
    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        for(Zamowienie z : listaZamowien){
            System.out.println("Zamówienie: ");
            z.wyswietlZamowienie();
            System.out.println();
        }
    }
    public double obliczLacznyKosztZamowien(){
        double oblicz = 0;
        for(Zamowienie z : listaZamowien){
            oblicz+=z.getKosztZamowienia();
        }
        return oblicz;
    }

}
