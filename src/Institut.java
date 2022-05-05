import java.util.ArrayList;
import java.util.List;

public class Institut {
    private String nom;
    //private Persona personas;
    private List<Persona> personas = new ArrayList<>();

    public Institut() {

    }

    public void nom(String nom) {
        this.nom = nom;
    }

    public void afegirPersones(Persona personas) {
        this.personas.add(personas);
    }
    /*public void afegirProfe(Professor profe) {
        this.personas.add(profe);

    }

    public void afegirEstudiant(Estudiant alumno) {
        this.personas.add(alumno);
    }*/
    public void imprimirInformacio()  throws Exception {
        System.out.println("Institut la guineueta. Llista de persones:  " + this.nom);
        for (Persona p : personas) {
            System.out.println(p.obtenirDades());
        }
    }
}
