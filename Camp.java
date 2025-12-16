
/**
 * Décrivez votre classe Camp ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Camp {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom = "Empire";

    /**
     * Constructeur d'objets de classe Camp
     */
    public Camp() {
    
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }
    
    public int boostMana() {
        return 50;
    }
    
    public String toString() {
        return this.nom;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
   
}