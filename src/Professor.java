public class Professor extends Persona {

    private double nouSou;

    public Professor() {}


    public void canviarSou(double nouSou) {

        this.nouSou = nouSou;
    }

    public String obtenirDades() {
        //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades() + " El seu sou es:  " + this.nouSou;
    }

}
