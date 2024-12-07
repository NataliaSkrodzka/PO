import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;
    private ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.listaZamowien = new ArrayList<>();
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
        if(imie==null || imie.isEmpty()){
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        if(nazwisko==null || nazwisko.isEmpty()){
            throw new IllegalArgumentException("Pole inazwisko nie może być puste");
        }
    }
    public Adres getAdres() {
        return adres;
    }
    public void setAdres(Adres adres) {
        this.adres = adres;
        if(adres==null){
            throw new IllegalArgumentException("Pole adres nie może być puste");
        }
    }
    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Klient other = (Klient) obj;
        if (imie == null) {
            if (other.imie != null)
                return false;
        } else if (!imie.equals(other.imie))
            return false;
        if (nazwisko == null) {
            if (other.nazwisko != null)
                return false;
        } else if (!nazwisko.equals(other.nazwisko))
            return false;
        if (adres == null) {
            if (other.adres != null)
                return false;
        } else if (!adres.equals(other.adres))
            return false;
        return true;
    }

}
