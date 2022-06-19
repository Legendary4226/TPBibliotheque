package bibliotheque;

public class Livre {

    private static int dernierNum;

    private int NumLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;

    public Livre(String titre, int nombreDePages, Personne auteur) {
        this.titre = titre;
        this.nombreDePages = nombreDePages;
        this.auteur = auteur;
        NumLivre = ++dernierNum;
    }


    public int getNumLivre() {
        return 0;
    }

    public void setNumLivre(int numLivre) {

    }

    public String getTitre() {
        return null;
    }

    public void setTitre(String titre) {

    }

    public int getNombreDePages() {
        return 0;
    }

    public void setNombreDePages(int nombreDePages) {

    }

    public Personne getAuteur() {
        return null;
    }

    public void setAuteur(Personne auteur) {

    }

    @Override
    public String toString() {
        return "Livre{" +
                "NumLivre=" + NumLivre +
                ", titre='" + titre + '\'' +
                ", nombreDePages=" + nombreDePages +
                ", auteur=" + auteur +
                '}';
    }
}
