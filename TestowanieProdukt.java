import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class TestowanieProdukt {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Widelec",3.45,45);
        Produkt produkt2 = new Produkt("Łyżka",2.45,62);
        System.out.println(produkt1);
        System.out.println(produkt1);
        System.out.println(produkt1.toString());
        System.out.println(produkt1);
        produkt1.dodajDoMagazynu(3);
        produkt2.dodajDoMagazynu(5);
        System.out.println(produkt1);
        System.out.println(produkt2);
        produkt1.usunZMagazynu(49);
        produkt2.usunZMagazynu(49);
        System.out.println(produkt1);
        System.out.println(produkt2);
        KoszykZakupowy koszyk1 = new KoszykZakupowy();
        KoszykZakupowy koszyk2 = new KoszykZakupowy();
        koszyk2.dodajProdukt(produkt1,3);
        koszyk1.dodajProdukt(produkt1,8);
        koszyk1.dodajProdukt(produkt2,8);
        System.out.println(koszyk1);
        System.out.println(produkt1);
        System.out.println(produkt2);
        koszyk1.dodajProdukt(produkt2,11);
        System.out.println(koszyk1.obliczCalkowitaWartosc());
        Zamowienie zamowienie1 = new Zamowienie(koszyk1);
        Zamowienie zamowienie2 = new Zamowienie(koszyk2);
        zamowienie1.wyswietlZamowienie();
        Adres adres1 = new Adres("Bilitewskiego",4,39,"Olsztyn",10-693);
        Klient klient1 = new Klient("Natalia","Skrodzka",adres1);
        klient1.dodajZamowienie(zamowienie1);
        klient1.dodajZamowienie(zamowienie2);
        klient1.wyswietlHistorieZamowien();
        System.out.println(klient1.obliczLacznyKosztZamowien());
        Magazyn magazyn1 = new Magazyn();
        //Sklep sklep1 = new Sklep("Sklep dla zwierząt",magazyn1,"05-12-2024");
//        sklep1.dodajProdukt(produkt1);
//        sklep1.dodajProdukt(produkt2);
//        sklep1.wyswietlOferty();
//        System.out.println(sklep1.wyszukajProduktu("widelec"));
        zamowienie1.ustawStatusZamowienia("Awaria");
        zamowienie1.wyswietlZamowienie();
        zamowienie1.zwrocProdukt(produkt1,2);
        zamowienie1.wyswietlZamowienie();
        zamowienie2.zwrocProdukt(produkt1,2);
        zamowienie2.wyswietlZamowienie();
        System.out.println();
        System.out.printf("%.2f%n",koszyk1.obliczCalkowitaWartosc());
        Platnosc platnosc1 = new Platnosc(zamowienie1);
        platnosc1.zaplac(zamowienie1);
        zamowienie1.finalizujZamowienie();
        zamowienie1.wyswietlZamowienie();
        //sklep1.zakupy(koszyk1,produkt1,3);
        System.out.println();
        System.out.println(koszyk1);
        System.out.println();
        System.out.println(produkt1);
        System.out.println();
        System.out.println(koszyk1);
        System.out.println(magazyn1);






    }
}
// tu jest kod equals
// https://javastart.pl/baza-wiedzy/programowanie-obiektowe/metoda-equals
