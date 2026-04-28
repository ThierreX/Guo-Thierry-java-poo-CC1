public class Joueur {
    private String nom;
    private String prenom;
    
    public Joueur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        System.out.println("Joueur créé : " + nom + " " + prenom);
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
}