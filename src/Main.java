import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Date dataInici = new Date(2003,5,12);
        Date dateFi = new Date(2004,2,12);


        //System.out.println("Hello world!");

        p1.canviarNom("Marc");
        p1.assignarDni("39437156A");
        String dades = p1.obtenirDades() ;

        System.out.println(dades);

        p1.canviarNom("Albert");
        p1.assignarDni("39537193Q");
        dades = p1.obtenirDades();

        System.out.println(dades);

        Estudiant e = new Estudiant();
        e.canviarNom("Pepito");
        e.assignarDni("39437196F");
        e.posarNota(7.5);
        dades = e.obtenirDades() ;

        System.out.println(dades);


        Professor pr1 = new Professor();
        pr1.canviarNom("marc");
        pr1.assignarDni("39658745A");
        pr1.canviarSou(455.35);
        dades = pr1.obtenirDades() ;
        System.out.println(dades);

        ProfessorSubstitut prSbs1 = new ProfessorSubstitut();
        prSbs1.canviarNom("Alex");
        prSbs1.assignarDni("39658742A");
        prSbs1.canviarSou(555.222);
        prSbs1.assignarSubstitucio(dataInici, dateFi);
        dades = prSbs1.obtenirDades() ;

        System.out.println(dades + " La  seva data d'inici es " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() + " la seva data de fi es :  " + dateFi.getDate() + "/" + dateFi.getMonth() + "/" + dateFi.getYear());

        Institut ins1 = new Institut();


        String informacio = ins1.imprimirInformacio();
        System.out.println(informacio);

    }
}