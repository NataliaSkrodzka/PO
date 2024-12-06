public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;
    public Produkt(String nazwa,double cena,int iloscNaMagazynie) {
        this.nazwa=nazwa;
        this.cena=cena;
        this.iloscNaMagazynie=iloscNaMagazynie;
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena() {
        return cena;
    }
    public double getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }
    @Override
    public String toString() {
        return "Nazwa: "+nazwa+" cena: "+cena+" ilość na magazynie: "+iloscNaMagazynie;
    }
    public void dodajDoMagazynu(int dodaj){
        iloscNaMagazynie+=dodaj;
    }
//    public void dodajProdukt(Produkt produkt,int ile) {
//        if (produkt.iloscNaMagazynie>=ile){
//            if (magazyn.containsKey(produkt)){
//                produkty.replace(produkt,produkty.get(produkt)+ile);
//            }
//            else {
//                magazyn.put(produkt, ile);
//            }
//        }
//        else {
//            System.out.println("Niewystarczajaca ilosc produktów");
//        }
//    }
    public void usunZMagazynu(int usun){
        if (iloscNaMagazynie>=usun) {
            iloscNaMagazynie -= usun;
        }
        else{
            System.out.println("Na magazynie jest tylko "+iloscNaMagazynie+" sztuk");
        }
    }

}
