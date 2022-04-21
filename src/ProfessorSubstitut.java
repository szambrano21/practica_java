import java.util.Date;

public class ProfessorSubstitut extends Professor {
    private Date dataInici;

    private Date dataFi;

    public void assignarSubstitucio(Date dataInici, Date dataFi) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public String obtenirDades() {
        //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades();
    }
}
