public class Professor extends Persona {

    private double sou;

    public Professor() {

    }


    public void canviarSou(double nouSou) throws Exception {
        this.sou = nouSou;

        if ( sou > 3000) {
            throw new Exception("Error de sou");
        }
        else if ( sou < 0) {
            throw new Exception("Error de sou");
        }
    }

    public String obtenirDades() throws Exception  {
        //vull que em doni el mateix que persona

        return super.obtenirDades() + " (PROFE amb sou :  " + this.sou + ")";
    }

}
