public class Persona {

    private String nom;
    private String dni;

    public Persona() {
        //Constructors
        //System.out.println("Hola")
    }


    public void canviarNom(String nom) throws Exception {
        this.nom = nom;
    }

        public void assignarDni(String dni) throws Exception  {

         if (this.dni == null) {
             this.dni = dni;
         } else   {
             throw new Exception("No es pot cambiar un dni, ya assignat");
         }
    }

    // funcio que retorna el nom y el dni de la persona

    public String obtenirDades() throws Exception {
        if (this.nom == null) { //condicio de si la persona no tè el nom , salta una excepció
            throw new Exception("Falta assignar el nom");
        } else if (this.dni == null) { //condicio de si la persona no tè el dni , salta una excepció
            throw new Exception("Falta assignar el dni");
        }

        return "persona amb nom " + this.nom + " i DNI " + this.dni ;
    }
}
