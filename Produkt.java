public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa,double cena,int iloscNaMagazynie) {
        this.nazwa=nazwa;
        this.cena=cena;
        this.iloscNaMagazynie=iloscNaMagazynie;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
        if(nazwa==null || nazwa.isEmpty()){
            throw new IllegalArgumentException("Nazwa nie może być pusta");
        }
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produkt other = (Produkt) obj;
        if (nazwa == null) {
            if (other.nazwa != null)
                return false;
        } else if (!nazwa.equals(other.nazwa))
            return false;
        if (Double.doubleToLongBits(cena) != Double.doubleToLongBits(other.cena))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17; // Można zacząć od dowolnej liczby niezerowej
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + Double.hashCode(cena);
        return result;
    }

}
