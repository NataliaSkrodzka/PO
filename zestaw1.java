// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zestaw1 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String imie = "Natalia";
        String nazwisko = "Skrodzka";
        System.out.println(imie + " " + nazwisko);
        int dlugosc = imie.length() + nazwisko.length();
        System.out.println("Dlugosc imienia i nazwiska to: " + dlugosc);
        String wyraz1 = "Ala";
        String wyraz2 = "ma";
        String wyraz3 = "kota";
        String wyraz4 = (wyraz1 + wyraz2 + wyraz3);
        System.out.println(wyraz4);
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("*");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("**");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("***");
        for (int i = 0; i < 14; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        for (int i = 0; i < 15; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        for (int i = 0; i < 14; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("***");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("**");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("*");

        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *");

        String zdanie = ("Ala ma kota");
        String zdaniee = zdanie.replace('a','e');
        System.out.println(zdaniee);
        String zdanie2 = zdanie.toUpperCase();
        System.out.println(zdanie2);
        String zdanie3 = zdanie.toLowerCase();
        System.out.println(zdanie3);
        int kod1 = (int)'A';
        int kod2 = (int)'!';
        int kod3 = (int)'@';
        int kod4 = (int)'>';
        int kod5 = (int)'~';
        int kod6 = (int)'\n';
        int kod7 = (int)'\b';


        System.out.println("Kody ASCI znaków: 'A' - " + kod1 + ", '!' - " + kod2 + ", '@' - " + kod3 + ", '>' - " +kod4 + ",'~' - " + kod5 + ", \'\\n\' - " + kod6 + ", \'\\b\'  - " + kod7  );
        //male litery 61-122, duze litery 65-90, cyfry 48-57
        String zdanko = ("Grzesiek nie wiedzial dlaczego ... jest tak drapieznym ... mimo, ze jego ... na to nie wskazuje");
        System.out.println(zdanko.format);
