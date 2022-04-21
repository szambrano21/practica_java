public class ProfessorSubstitut extends Professor {
    private String dataInici;

    private String dataFi;

    public void assignarSubstitucio(String dataInici, String dataFi) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public String obtenirDades() {
        //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades() + " la seva data d'inici es:   " + this.dataInici + "i la seva data de Fi és :  " + this.dataFi;
    }
}
