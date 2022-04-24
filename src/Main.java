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
        p1.assignarDni("39433156L");
        String dades = p1.obtenirDades() ;
        System.out.println(dades);

        p2.canviarNom("Luis");
        p2.assignarDni("39437156Q");

        dades = p2.obtenirDades();
        System.out.println(dades);

        p1.canviarNom("Albert");
        p1.assignarDni("39537193Q");
        dades = p1.obtenirDades();

        System.out.println(dades);

        Estudiant e = new Estudiant();
        e.canviarNom("Pepito");
        e.assignarDni("39437196F");
        e.posarNota(8.5);
        //e.posarNota(-8.5);
        //e.posarNota(12);
        dades = e.obtenirDades() ;

        System.out.println(dades);


        Professor pr1 = new Professor();
        pr1.canviarNom("marc");

        pr1.assignarDni("39658745M");
        pr1.canviarSou(455.35);
        //pr1.canviarSou(-500);
        dades = pr1.obtenirDades() ;
        System.out.println(dades);

        ProfessorSubstitut prSbs1 = new ProfessorSubstitut();
        prSbs1.canviarNom("Alex");
        prSbs1.assignarDni("39658742A");
        prSbs1.canviarSou(400.00);
        //prSbs1.canviarSou(4000);
        //prSbs1.canviarSou(-4000);
        prSbs1.assignarSubstitucio(dataInici, dateFi);
        dades = prSbs1.obtenirDades() ;

        System.out.println(dades + " La  seva data d'inici es " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() + " la seva data de fi es :  " + dateFi.getDate() + "/" + dateFi.getMonth() + "/" + dateFi.getYear());

        Institut ins1 = new Institut();
        ins1.afegirEstudiant();
        ins1.afegirProfe();
        String informacio = ins1.imprimirInformacio();
        System.out.println(informacio);

    }
}