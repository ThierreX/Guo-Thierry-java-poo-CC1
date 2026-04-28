public class Redacteur {
    private String nom;
    private String prenom;
    
    public Redacteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        System.out.println("Rédacteur créé : " + prenom);
    }
        
    public String getNom(){
            return nom;
    }
        
    public String getPrenom(){
            return prenom;
    }
}