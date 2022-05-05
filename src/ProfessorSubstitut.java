import java.util.Date;

public class ProfessorSubstitut extends Professor {
    Date dateInici = new Date(2003,5,12);
    Date dateFi = new Date(2004,2,12);
    private Date dataInici;
    private Date dataFi;

    public void assignarSubstitucio(Date dataInici, Date dataFi) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public String obtenirDades() throws Exception  {

        //vull que em doni el mateix que persona
        // mes la nota
        return super.obtenirDades() + " La  seva data d'inici es " + dateInici.getDate() + "/" + dateInici.getMonth() + "/" + dateInici.getYear() + " la seva data de fi es :  " + dateFi.getDate() + "/" + dateFi.getMonth() + "/" + dateFi.getYear();
    }
}
