package bibliotheque;

public class Personne {
    private static int DernierNumero = 0;

    private int numeroPers = DernierNumero++;
    private String nomPers;
    private String prenomPers;
    private int anNaissance;

    public Personne(String nom, String prenom, int anneeNaissance) {
        nomPers = nom;
        prenomPers = prenom;
        anNaissance = anneeNaissance;
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

    public static int getDernierNumero() {
        return DernierNumero;
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
        return nomPers + ", " + prenomPers + ", " + anNaissance+ ", " + numeroPers;
    }
}
