public class Main {

    public static void main(String[] args) {

    Firma firma = new Firma();
    Pracownik pracownikmax = new Pracownik("Max", "Dasdnj", 56564, "Mleczarz");
    Pracownik pracownikKasia = new Pracownik("Kasia", "kanapa", 2137, "DJ");
    Pracownik pracownikBasia = new Pracownik("Basia", "bumbox", 123761, "Reformator");

    Kierownik kierownik = new Kierownik("Arnold", "Shwarc", 887324324, "Aktor");
    firma.dodajPracownika(pracownikmax);
    firma.dodajPracownika(pracownikKasia);
    firma.dodajPracownika(pracownikBasia);

    kierownik.dodajPracownika(pracownikKasia);
    kierownik.dodajPracownika(pracownikBasia);

    System.out.println(pracownikmax);
    System.out.println(pracownikKasia);
    System.out.println(pracownikBasia);
    System.out.println(kierownik);
        System.out.println(firma.ileNaWyplaty());
        kierownik.dajPodwyzke(10);
        System.out.println(firma.ileNaWyplaty());

        System.out.println(pracownikmax);
        System.out.println(pracownikKasia);
        System.out.println(pracownikBasia);
        System.out.println(kierownik);



    }

}