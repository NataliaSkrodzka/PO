public class Adres {
    private String ulica;
    private int numerDomu;
    private int numerMieszania;
    private String miasto;
    private int kodPocztowy;
    public Adres(String ulica, int numerDomu, int numerMieszania, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszania = numerMieszania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
}
