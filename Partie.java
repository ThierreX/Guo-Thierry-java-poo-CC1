public class Partie {
    private int score;
    private Joueur joueur;
    private Quiz quiz;
    
    public Partie(int score, Joueur joueur, Quiz quiz){
        this.score = score;
        this.joueur = joueur;
        this.quiz = quiz;
        
        System.out.println("Nouvelle partie avec : " + joueur.getPrenom() + ", Quiz : " + quiz.getNom());
    }
}