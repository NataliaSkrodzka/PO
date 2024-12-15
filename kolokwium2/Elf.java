public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie,int wiek, String stanowisko){
        this.imie=imie;
        this.wiek=wiek;
        this.stanowisko=stanowisko;
    }
    public String getImie(){
        return imie;
    }
    public int getWiek(){
        return wiek;
    }
    public String getStanowisko(){
        return stanowisko;
    }
    public void setImie(String imie){
        this.imie = imie;
        if(imie==null || imie.isEmpty()){
            throw new IllegalArgumentException("pole imie nie może być puste");
        }
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
        if(wiek<=0){
            throw new IllegalArgumentException("Wiek musi być większy od zera");
        }
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
        if(stanowisko==null || stanowisko.isEmpty()){
            throw new IllegalArgumentException("pole stanowisko nie może być puste");
        }
    }

    public void przedstawSie(Elf elf){
        System.out.println("Cześć, nazywam się "+ elf.imie+" mam " + elf.wiek + " lat, a moje stanowisko pracy to " + elf.stanowisko );
    }
    @Override
    public String toString() {
        return "Elf Imie: "+imie+" wiek: "+wiek+" stanowisko: "+stanowisko;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Elf other = (Elf) obj;
        if (imie == null) {
            if (other.imie != null)
                return false;
        } else if (!imie.equals(other.imie))
            return false;
        if (stanowisko == null) {
            if (other.stanowisko != null)
                return false;
        } else if (!stanowisko.equals(other.stanowisko))
            return false;

        return true;
    }
}
