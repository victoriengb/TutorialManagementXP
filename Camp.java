public class Camp {

    private String nom = "Empire";

    public Camp () {
    
    }
    public void setNom (String nom) {
        this.nom = nom;
    }
    public String getNom () {
        return this.nom;
    }
    
    public int boostMana () {
        return 50;
    }
    
    public String toString () {
        return this.nom;
    }

}