package bibliotheque;

import java.util.ArrayList;

public class ListePersonnes {
    ArrayList<Personne> personnes = new ArrayList<>();

    /**
     * Permet d'ajouter une personne
     * @param personne personne
     */
    public void ajoutPers(Personne personne) {
        if (personne != null) {
            personnes.add(personne);
        }
    }

    /**
     * Permet de vérifier si une personne appartient à la liste.
     * @param personne personne
     * @return true si la personne est dans la liste, false sinon
     */
    public boolean appartient(Personne personne) {
        return personnes.contains(personne);
    }

    /**
     * Permet de vérifier si une personne appartient à la liste avec son nom et prenom.
     * @param nom nom
     * @param prenom prenom
     * @return true si la personne est dans la liste, false sinon
     */
    public boolean appartient(String nom, String prenom) {
        boolean check = false;
        for (Personne personne : personnes) {
            if (personne.getNom().compareTo(nom) == 0 && personne.getPrenom().compareTo(prenom) == 0) {
                check = true;
            }
        }
        return check;
    }
}
