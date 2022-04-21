//vull que heredi de persona

public class Estudiant extends Persona{
    // si aqui no fico res, ja te tot el que te la clase persona gracies a extends Persona

    private double nota;

    public Estudiant() {}

    public void posarNota(double nota) {
        this.nota = nota;
    }

    public String obtenirDades() {
    //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades() + " que te de nota:  " + this.nota;
    }

}
