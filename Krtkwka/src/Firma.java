import java.util.ArrayList;

public class Firma {

    private ArrayList<Pracownik> pracownicyLista = new ArrayList<>();

    public Firma() {
        pracownicyLista = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownicy) {
        pracownicyLista.add(pracownicy);
    }
        public double ileNaWyplaty(){
            double kwota = 0;
            for (int  i = 0; i< pracownicyLista.size(); i++){
                kwota = kwota + pracownicyLista.get(i).getWyplata();
            }
            return kwota;
        }

}
