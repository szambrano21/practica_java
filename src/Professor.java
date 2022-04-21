public class Professor extends Persona {

    private double sou;

    public Professor() {}


    public void canviarSou(double nouSou) {

        this.sou = nouSou;
    }

    public String obtenirDades() {
        //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades() + " El seu sou es:  " + this.sou;
    }

}
