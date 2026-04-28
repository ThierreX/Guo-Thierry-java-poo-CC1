public class Main {
    public static void main(String[] args) {
        
        System.out.println("===   ===");
        
        // Catégories
        Categorie comedie = new Categorie("Cinéma");

        // Positions
        Position A = new Position("A");
        Position B = new Position("B");
        Position C = new Position("C");
        Position D = new Position("D");

        // Rédacteur
        Redacteur r1 = new Redacteur("Guo", "Thierry");

        // Quiz
        Quiz quiz1 = new Quiz("ABSOLUTE Quiz", comedie, r1);

        // Question
        Question q1 = new Question("Quel est le meilleur meme ?");

        q1.ajouterReponse(new Reponse("67", false, A));
        q1.ajouterReponse(new Reponse("skibidi", false, B));
        q1.ajouterReponse(new Reponse("Argent 100% Haram", true, C));
        q1.ajouterReponse(new Reponse("brainrot", false, D));

        quiz1.ajouterQuestion(q1);

        // Joueurs
        Joueur j1 = new Joueur("Luca", "Lachaud");
        Joueur j2 = new Joueur("Ya", "Yael");

        // Parties
        Partie p1 = new Partie(4, j1, quiz1);
        Partie p2 = new Partie(3, j2, quiz1);

        System.out.println("===   ===");
    }
}