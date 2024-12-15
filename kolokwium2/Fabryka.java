import java.util.ArrayList;
public class Fabryka {
    private ArrayList<Elf>elfy;
    private double dlGeo;
    private double szGeo;

    public Fabryka(double dlGeo, double szGeo){
        this.dlGeo=dlGeo;
        this.szGeo=szGeo;
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public double getSzGeo() {
        return szGeo;
    }
    public ArrayList<Elf> getElfy() {
        return elfy;
    }

    public void setDlGeo(double dlGeo) {
        this.dlGeo=dlGeo;
        if(dlGeo<-180 || dlGeo>180){
            throw new IllegalArgumentException("Dlugosc geograficzna musi byc z przedzialu -180 a 180");
        }
    }

    public void setSzGeo(double szGeo) {
        this.szGeo = szGeo;
        if(dlGeo<-90 || dlGeo>90){
            throw new IllegalArgumentException("Szerokość geograficzna musi byc z przedzialu -90 a 90");
        }
    }
    public void dodajPracownika(Elf elf) {
        this.elfy.add(elf);
    }
    public void usunPracownika(Elf elf) {
        this.elfy.remove(elf);
    }
    public Elf najstarszyPracownik(){
        Elf elf= elfy.get(0);
        for(Elf staryeElf:elfy){
            if(staryeElf.getWiek()>elf.getWiek()){
                elf=staryeElf;
            }
            return elf;
        }

        return elf;
    }
     @Override
     public String toString() {
         return "Fabryka: długość geograficzna: "+dlGeo+" szerokosc geograficzna: "+szGeo;
     }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fabryka other = (Fabryka) obj;
        if (Double.doubleToLongBits(dlGeo) != Double.doubleToLongBits(other.dlGeo))
            return false;
        if (Double.doubleToLongBits(szGeo) != Double.doubleToLongBits(other.szGeo))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17; // Można zacząć od dowolnej liczby niezerowej
        result = 31 * result + Double.hashCode(szGeo);
        result = 31 * result + Double.hashCode(dlGeo);
        return result;
    }
}
