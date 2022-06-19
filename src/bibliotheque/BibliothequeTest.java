package bibliotheque;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliothequeTest {

    Bibliotheque bibliotheque;
    Personne alan;
    Livre computing;


    @Before
    public void setUp(){
        bibliotheque = new Bibliotheque();
        alan = new Personne("Turing", "Alan", 1912);
        computing = new Livre("Computing Machinery and Intelligence", 250, alan);
        bibliotheque.ajouterLivre(computing);
    }
    /**
     * Test de de la recherche selon le titre du livre.
     */
    @Test
    public void rechercherLivreParTitre(){
        assertEquals(1,bibliotheque.rechercherParTitre("Computing").size());
    }
    /**
     * Test de de la recherche selon le nom de l'auteur.
     */
    @Test
    public void  rechercherLivreParAuteur(){
        assertEquals(1,bibliotheque.rechercherParAuteur(alan).size());
    }





}
