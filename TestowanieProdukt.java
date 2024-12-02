public class TestowanieProdukt {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Widelec",3.45,45);
        Produkt produkt2 = new Produkt("Łyżka",2.45,62);
        produkt1.wyswietlInformacje();
        produkt2.wyswietlInformacje();
        produkt1.dodajDoMagazynu(3);
        produkt2.dodajDoMagazynu(5);
        produkt1.wyswietlInformacje();
        produkt2.wyswietlInformacje();
        produkt1.usunZMagazynu(49);
        produkt2.usunZMagazynu(49);
        produkt1.wyswietlInformacje();
        produkt2.wyswietlInformacje();
        KoszykZakupowy koszyk1 = new KoszykZakupowy();
        koszyk1.dodajProdukt(produkt1,8);
        koszyk1.dodajProdukt(produkt2,8);
        koszyk1.wyswietlZawartoscKoszyka();
        produkt1.wyswietlInformacje();
        produkt2.wyswietlInformacje();
        koszyk1.dodajProdukt(produkt2,11);
        System.out.println(koszyk1.obliczCalkowitaWartosc());

    }
}
