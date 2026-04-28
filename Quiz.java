import java.util.ArrayList ;

public class Quiz {
    private String nom;
    private Categorie categorie;
    private Redacteur redacteur;
    private ArrayList<Question> questions = new ArrayList<>();
    
    public Quiz(String nom, Categorie categorie, Redacteur redacteur) {
        this.nom = nom;
        this.categorie = categorie;
        this.redacteur = redacteur;
        
        System.out.println("Quiz créé : "+ nom);
    }
    
    public void ajouterQuestion(Question quest){
        questions.add(quest);
        System.out.println("Question ajoutée dans le quiz : " + quest.getTitre());
    }
    
    public String getNom(){
        return nom;
    }    
    
}