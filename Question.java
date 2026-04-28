import java.util.ArrayList;

public class Question {
    private String titre;
    private ArrayList<Reponse> reponses = new ArrayList<>();
    
    public Question(String titre) {
        this.titre = titre;
        System.out.println("Question créé : " + titre);
    }
    
    public void ajouterReponse(Reponse rep) {
        if (reponses.size()<4){
            reponses.add(rep);
        }
    }
    
    public String getTitre(){
        return titre;
    }
    
}