public class Professor extends Persona {

    private double sou;

    public Professor() {

    }


    public void canviarSou(double nouSou) {
        this.sou = nouSou;
    }

    public String obtenirDades() {

        if ( sou > 3000) {
            throw new ArithmeticException("Access denied");
        }
        if ( sou < 0) {
            throw new ArithmeticException("Access denied");
        }
        //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades() + " El seu sou es:  " + this.sou;
    }

}
