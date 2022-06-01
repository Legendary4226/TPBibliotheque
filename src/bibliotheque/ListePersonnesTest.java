package bibliotheque;

import org.junit.*;

import static org.junit.Assert.*;

public class ListePersonnesTest {
    public ListePersonnesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }


    /**
     * Test l'ajout des personnes.
     */
    @Test
    public void ajoutPers() {
        ListePersonnes liste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        liste.ajoutPers(alan);
    }
    /**
     * Test la presence des personnes selon l'objet personne.
     */
    @Test
    public void appartient() {
        ListePersonnes liste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        liste.ajoutPers(alan);
        assertEquals(true, liste.appartient(alan));
    }
    /**
     * Test la presence des personnes selon le nom et prenom de la personne.
     */
    @Test
    public void testAppartient() {
        ListePersonnes liste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        liste.ajoutPers(alan);
        assertEquals(true, liste.appartient(alan.getNom(),alan.getPrenom()));
    }
}