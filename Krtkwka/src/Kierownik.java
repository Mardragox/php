import java.util.ArrayList;

public class Kierownik extends Pracownik{

    private ArrayList<Pracownik> pracownicy;

    public Kierownik(String imie, String nazwisko, double wyplata, String stanowisko) {
        super(imie, nazwisko, wyplata, stanowisko);
        this.pracownicy = new ArrayList<>();

    }

    public void dodajPracownika(Pracownik pracownik){
        pracownicy.add(pracownik);
    }
    public void dajPodwyzke(int procent){
        podwyzkaWyplaty(procent);
        for (Pracownik pracus:pracownicy) {
            pracus.podwyzkaWyplaty(procent);

        }
    }
}
