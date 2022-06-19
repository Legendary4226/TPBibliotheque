package bibliotheque;

public class Livre {

    private static int dernierNum = 0;

    private int NumLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;

    public Livre(String titre, int nombreDePages, Personne auteur) {
        this.titre = titre;
        this.nombreDePages = nombreDePages;
        this.auteur = auteur;
        NumLivre = dernierNum++;
    }


    public int getNumLivre() {
        return NumLivre;
    }

    public void setNumLivre(int numLivre) {
        NumLivre = numLivre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public Personne getAuteur() {
        return auteur;
    }

    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    public String toString() {
        return titre + ", " + auteur.getPrenom() + " " + auteur.getNom() + ", " + nombreDePages + "p.";
    }
}
