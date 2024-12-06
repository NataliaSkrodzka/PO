import java.util.HashMap;

public class Magazyn {
    private HashMap<Produkt, Integer> magazyn;
    public Magazyn() {
        this.magazyn = new HashMap<>();
    }
    @Override
    public String toString(){
        StringBuilder wynik= new StringBuilder();
        for(Produkt p : this.magazyn.keySet()) {
            wynik.append("Nazwa: ").append(p.getNazwa()).append(" Ilość na magazynie: ").append(p.getIloscNaMagazynie());
        }
        if(this.magazyn.isEmpty()){
            System.out.println("Ten magazyn jest pusty");
        }
        return wynik.toString();
    }
}