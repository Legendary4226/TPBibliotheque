package bibliotheque;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ListePersonnesTest {


    ListePersonnes liste;
    Personne alan;


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
        liste = new ListePersonnes();
        alan = new Personne("Turing", "Alan", 1912);
        liste.ajoutPers(alan);

    }
    @After
    public void tearDown() {
    }


    /**
     * Test l'ajout des personnes.
     */
    @Test
    public void ajoutPers() {

    }
    /**
     * Test la presence des personnes selon l'objet personne.
     */
    @Test
    public void appartient() {
        assertEquals(true, liste.appartient(alan));
    }
    /**
     * Test la presence des personnes selon le nom et prenom de la personne.
     */
    @Test
    public void testAppartient() {
        assertEquals(true, liste.appartient(alan.getNom(),alan.getPrenom()));
    }
}