package bibliotheque;

public class Personne {

    private int numeroPers;
    private String nomPers;
    private String prenomPers;
    private int anNaissance;
    private final int dernierNumero;
    private static int tmpDernierNumero = 0;

    public Personne(String nom, String prenom, int anneeNaissance) {
        nomPers = nom;
        prenomPers = prenom;
        anNaissance = anneeNaissance;

        dernierNumero = tmpDernierNumero++;
    }

    public int getNumero() {
        return numeroPers;
    }

    public String getNom() {
        return nomPers;
    }

    public String getPrenom() {
        return prenomPers;
    }

    public int getAnNaissance() {
        return anNaissance;
    }

    public int getDernierNumero() {
        return dernierNumero;
    }

    public void setNumPers(int numeroPers) {
        this.numeroPers = numeroPers;
    }

    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    public void setPrenomPers(String prenomPers) {
        this.prenomPers = prenomPers;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }

    @Override
    public String toString() {
        return nomPers + " " + prenomPers + " " + numeroPers;
    }
}
