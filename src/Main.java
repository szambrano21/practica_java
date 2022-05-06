import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Estudiant e = new Estudiant();
        Professor pr1 = new Professor();
        ProfessorSubstitut prSbs1 = new ProfessorSubstitut();
        Institut ins1 = new Institut();

        //Date dateInici = new Date(2003,5,12);
        //Date dateFi = new Date(2004,2,12);


        //System.out.println("Hello world!");

        p1.canviarNom("Marc");
        p1.assignarDni("39437195Q");
        //p1.assignarDni("78677967r");

        String dades = p1.obtenirDades() ;
        //System.out.println(dades);

        p2.canviarNom("Luis");
        p2.assignarDni("39437156Q");
        //p2.assignarDni("39437156Q");
        dades = p2.obtenirDades();
        //System.out.println(dades);

        dades = p1.obtenirDades();

        //System.out.println(dades);

        //estudiant

        e.canviarNom("Pepito");
        e.assignarDni("39437196F");
        e.posarNota(8.7);
        e.posarNota(5.6);
        e.posarNota(3.2);
        e.posarNota(9.6);
        e.posarNota(4.7);
        e.posarNota(7.3);
        //e.posarNota(-8.5);
        //e.posarNota(12);
        dades = e.obtenirDades() ;

        //System.out.println(dades);


        //professor
        pr1.canviarNom("marc");
        pr1.assignarDni("39658745M");
        //pr1.assignarDni("87976979y");
        pr1.canviarSou(955.35);
        //pr1.canviarSou(-500);
        dades = pr1.obtenirDades() ;
        //System.out.println(dades);

        //professor substitut
        prSbs1.canviarNom("Alex");
        prSbs1.assignarDni("39658742A");
        prSbs1.canviarSou(800.0);
        //prSbs1.canviarSou(4000);
        //prSbs1.canviarSou(-4000);
        //prSbs1.assignarSubstitucio(dateInici, dateFi);
        dades = prSbs1.obtenirDades() ;
        //System.out.println(dades + " La  seva data d'inici es " + dateInici.getDate() + "/" + dateInici.getMonth() + "/" + dateInici.getYear() + " la seva data de fi es :  " + dateFi.getDate() + "/" + dateFi.getMonth() + "/" + dateFi.getYear());

        //institut
        ins1.nom("GUINEUETA");
        ins1.afegirPersones(p1);
        ins1.afegirPersones(p2);
        ins1.afegirPersones(e);
        ins1.afegirPersones(pr1);
        ins1.afegirPersones(prSbs1);
        ins1.imprimirInformacio();

    }
}