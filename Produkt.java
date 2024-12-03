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
    public void wyswietlInformacje(){
        System.out.println("Nazwa: "+nazwa+" Cena: "+cena+" Ilość na magazynie: "+iloscNaMagazynie);
    }
    public int dodajDoMagazynu(int dodaj){
        iloscNaMagazynie+=dodaj;
        return iloscNaMagazynie;
    }
    public int usunZMagazynu(int usun){
        if (iloscNaMagazynie>=usun) {
            iloscNaMagazynie -= usun;
        }
        else{
            System.out.println("Na magazynie jest tylko "+iloscNaMagazynie+" sztuk");
        }
        return iloscNaMagazynie;
    }

}
