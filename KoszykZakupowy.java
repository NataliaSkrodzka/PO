import java.util.HashMap;

public class KoszykZakupowy {
    private HashMap<Produkt, Integer> produkty;

    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }
    public void dodajProdukt(Produkt produkt,int ile) {
        if (produkt.iloscNaMagazynie>=ile){
            produkty.put(produkt,ile);
            produkt.usunZMagazynu(ile);
        }
        else {
            System.out.println("Niewystarczajaca ilosc produktów w magazynie");
        }
    }
    public void wyswietlZawartoscKoszyka(){
        for(Produkt produkt : produkty.keySet()) {
            System.out.println("Produkt: " + produkt.getNazwa() + " ilość: "+ produkty.get(produkt));
        }
    }
    public double obliczCalkowitaWartosc(){
        double calkowitaWartosc = 0;
        for(Produkt produkt : produkty.keySet()) {
            calkowitaWartosc+=produkt.getCena()*produkty.get(produkt);
        }
        return calkowitaWartosc;
    }
}
