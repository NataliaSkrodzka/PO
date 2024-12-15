public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc){
        this.imie=imie;
        this.predkosc=predkosc;
    }

    public String getImie() {
        return imie;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setImie(String imie) {
        this.imie = imie;
        if(imie==null || imie.isEmpty()){
            throw new IllegalArgumentException("pole imie nie może być puste");
        }
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
        if(predkosc<=0){
            throw new IllegalArgumentException("predkosc musi być większa od zera");
        }
    }
    @Override
    public String toString() {
        return "Renifer imie: "+imie+" predkość: "+predkosc;
    }

    public void nakarmRenifera(Renifer renifer){
        renifer.predkosc+=5;
    }
}
