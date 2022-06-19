package bibliotheque;

import java.util.ArrayList;
import java.util.Collection;

public class Bibliotheque {

    ArrayList<Livre> livres = new ArrayList<>();

    public Bibliotheque() {

    }

    /**
     * Permet d'ajouter un livre passé en paramètres.
     * @param livre livre à ajouter
     */
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    /**
     * Retourne une collection de livres écrit par un auteur.
     * @param auteur l'auteur
     * @return liste de livres
     */
    public Collection<Livre> rechercherParAuteur(Personne auteur) {
        ArrayList<Livre> match = new ArrayList<>();
        for(Livre l : livres)if(l.getAuteur().equals(auteur))match.add(l);
        return match;
    }

    /**
     * Retourne une collection de livres don't la chaine de caractères donnée est contenue dans le titre du livre.
     * @param titre titre du livre
     * @return liste de livres
     */
    public Collection<Livre> rechercherParTitre(String titre) {
        ArrayList<Livre> match = new ArrayList<>();
        for(Livre l : livres)if(l.getTitre().contains(titre))match.add(l);
        return match;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "livres=" + livres +
                '}';
    }
}
