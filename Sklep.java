import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> produkty;
    String nazwaSklepu;
    Magazyn magazynSklepu;
    LocalDate dataPowstania;
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String zformatowanaData = dataPowstania.format(myFormatObj);

    public Sklep(String nazwaSklepu, Magazyn magazynSklepu, CharSequence zformatowanaData) {
        this.produkty = new ArrayList<>();
        this.nazwaSklepu = nazwaSklepu;
        this.magazynSklepu = magazynSklepu;
        this.dataPowstania = LocalDate.parse(zformatowanaData, myFormatObj);
        if (this.dataPowstania.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data nie może być z przyszłości");
        }
        else{
            this.dataPowstania = LocalDate.parse(zformatowanaData, myFormatObj);
        }
    }

    public void dodajProdukt(Produkt p) {
        this.produkty.add(p);
    }

    public void wyswietlOferty() {
        for (Produkt p : produkty) {
            System.out.println(p.getNazwa());
        }
    }

    public String wyszukajProduktu(String nazwa) {
        nazwa = nazwa.toLowerCase();
        for (Produkt p : produkty) {
            if (p.getNazwa().toLowerCase().equals(nazwa)) {
                return p.getNazwa();
            }
        }
        return null;
    }

    public void zakupy(KoszykZakupowy koszykZakupowy,Produkt p, int ilosc) {
        koszykZakupowy.dodajProdukt(p,ilosc);
    }
}
