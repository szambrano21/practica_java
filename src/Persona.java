public class Persona {

    private String nom;
    private String dni;

    public Persona() {
        //Constructors
        //System.out.println("Hola")
    }


    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public void assignarDni(String dni) {
        this.dni = dni;
    }

    // funcio que retorna el nom y el dni de la persona

    public String obtenirDades() {

        return "persona que es diu " + this.nom + " i el seu dni es: " + this.dni ;
    }


}
