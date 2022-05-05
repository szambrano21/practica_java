//vull que heredi de persona

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona{
    // si aqui no fico res, ja te tot el que te la clase persona gracies a extends Persona

    private List<Double> nota = new ArrayList<>();
    public Estudiant() {

    }
    public void posarNota(double nota) throws Exception {
        this.nota.add(nota);
        if (nota > 10) {
            throw new Exception("note  denied");
        } else if (nota < 0) {
            throw new Exception("note denied");
        }
    }

    public String obtenirDades() throws Exception  {
    //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades() + " (ESTUDIANT amb nota:  " + this.nota + ")";
    }

}
