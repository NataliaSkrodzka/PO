import java.util.HashMap;

public class KoszykZakupowy {
    private HashMap<Produkt, Integer> produkty;

    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }
    public void dodajProdukt(Produkt produkt,int ile) {
        if (produkt.iloscNaMagazynie>=ile){
            if (this.produkty.containsKey(produkt)){
                produkty.replace(produkt,produkty.get(produkt)+ile);
            }
            else {
                produkty.put(produkt, ile);
            }
            produkt.usunZMagazynu(ile);
        }
        else {
            System.out.println("Niewystarczajaca ilosc produktów w magazynie");
        }
    }
    public void usunProdukt(Produkt produkt,int ile){
        if(produkty.containsKey(produkt)&&produkty.get(produkt)>=ile) {
            produkty.replace(produkt,produkty.get(produkt)-ile);
            produkt.dodajDoMagazynu(ile);
        }
        else {
            System.out.println("Niewystarczajaca ilosc produktów w koszyku");
        }
    }
    @Override
    public String toString(){
        StringBuilder wynik= new StringBuilder();
        for (Produkt produkt : produkty.keySet()) {
            wynik.append("Produkt: ").append(produkt.getNazwa()).append(" ilość: ").append(produkty.get(produkt)).append("\n");
        }
        if(produkty.isEmpty()){
            return "koszyk jest pusty";
        }
        return wynik.toString();
    }
    public double obliczCalkowitaWartosc(){
        double calkowitaWartosc = 0;
        for(Produkt produkt : produkty.keySet()) {
            calkowitaWartosc+=produkt.getCena()*produkty.get(produkt);
        }
        return calkowitaWartosc;
    }
}
