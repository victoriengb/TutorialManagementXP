
/**
 * Décrivez votre classe Joueur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Joueur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String pseudo;
    private int mana;
    private int pointDeVie;
    private Camp camp;

    /**
     * Constructeur d'objets de classe Joueur
     */
    public Joueur()
    {
        this.pseudo = "Sacha";
        this.mana = 100;
        this.pointDeVie = 100;
        this.camp = null;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int getMana()
    {
        // Insérez votre code ici
        return this.mana;
    }
    
    public int getPointDeVie(){
        return this.pointDeVie;
    }
    
    public String getPseudo(){
        return this.pseudo;
    }
    
    public Camp getCamp(){
        return this.camp;
    }
    
    public void setCamp(Camp camp){
        this.camp = camp;
    }
    
    public int boostMana(){
        if(this.camp.getNom() == "Empire"){
            this.mana += this.camp.boostMana();
        }
        return this.mana;
    }
    public String toString(){
        StringBuilder s = new StringBuilder(this.pseudo + " PV " + this.pointDeVie +
        " Mana " + this.mana);
        return s.toString();
    }
}