import java.util.ArrayList;

public class Sanie {
    private ArrayList<Renifer> listaReniferow;

    public Sanie(ArrayList listaReniferow){
        this.listaReniferow=listaReniferow;
    }

    public void dodajRenifera(Renifer renifer) {
        this.listaReniferow.add(renifer);
    }
    public int sumaPredkosci(){
        int suma=0;
        for(Renifer renifer:listaReniferow ){
            suma+= renifer.getPredkosc();
        }
        return suma;
    }
    public Renifer najwolniejszyRenifer() {
        Renifer najwolniejszy = listaReniferow.get(0);
        for (Renifer renifer : listaReniferow) {
            if (renifer.getPredkosc() < najwolniejszy.getPredkosc()) {
                najwolniejszy = renifer;
            }
        }
        return najwolniejszy;
    }

}
