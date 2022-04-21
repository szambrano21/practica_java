import java.util.ArrayList;
import java.util.List;

public class Institut {
    private String nom;
    private Persona personas;

    List<String> profe = new ArrayList<personas>();



    public Institut() {

    };

    public void afegirProfe(String profe) {
        List<String> ejemploLista = new ArrayList<String>();
        ejemploLista.add("Juan");
        ejemploLista.add("Pedro");
        ejemploLista.add("José");
        ejemploLista.add("María");
        ejemploLista.add("Sofía");

        this.nom = profe;
        System.out.println(ejemploLista);
    }

    public void afegirEstudiant(String estudiant) {

        personas.add("Juan");
        personas.add("Pedro");
        personas.add("José");
        personas.add("María");
        personas.add("Sofía");
        System.out.println(personas);
    }
    public String imprimirInformacio() {

        return "professor que es diu " + this.nom + " i alumne que es diu: " + this.nom ;
    }
}
