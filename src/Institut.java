import java.util.ArrayList;
import java.util.List;

public class Institut {
    private String nom;
    //private Persona personas;
    private List<String> personas;

    private List<String> alumnos;

    public Institut() {

    };

    public void afegirProfe() {
        List<String> personas = new ArrayList<String>();
        personas.add("Juan");
        personas.add("Pedro");
        personas.add("Jose");
        personas.add("Maria");
        personas.add("Sofia");

        this.personas = personas;


    }

    public void afegirEstudiant() {
        List<String> alumnos = new ArrayList<String>();
        alumnos.add("sara");
        alumnos.add("ismael");
        alumnos.add("abraham");
        alumnos.add("papo");
        alumnos.add("dani");

        this.alumnos = alumnos;

    }
    public String imprimirInformacio() {

        return "lista de profesores " + this.personas + " i lista de alumnos: " + this.alumnos ;
    }
}
