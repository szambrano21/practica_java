//vull que heredi de persona

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona{
    // si aqui no fico res, ja te tot el que te la clase persona gracies a extends Persona
    private double mayor;
    private double menor;
    private List<Double> notas = new ArrayList<>();
    /*public Estudiant() {

    }*/


    //SUM += NOTA;

    public void posarNota(double nota) throws Exception {
        this.notas.add(nota);

        if (nota > 10) {
            throw new Exception("note  denied");
        } else if (nota < 0) {
            throw new Exception("note denied");
        }

    }


    public String obtenirDades() throws Exception  {
    //vull que em doni el mateix que persona
        // mes la nota
        double numMin = 0;
        double numMax = 0;
        double suma = 0;
        double media = 0;
        for (double n : notas) {
            suma = suma + n;


            if (numMax == 0 && numMin == 0) {
                numMin =  n;
                numMax = n;
            }

            if (numMax < n) {
                numMax = n;
            } if (numMin > n) {
                numMin = n;
            }

        }

        media = suma / notas.size();

        return super.obtenirDades() + " (ESTUDIANT amb nota:  " + this.notas + " i nota mayor " + numMax + " i min: " + numMin + " media de las notas " + media + ")";
    }

}
