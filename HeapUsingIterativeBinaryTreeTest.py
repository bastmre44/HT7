import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class HeapUsingIterativeBinaryTreeTest {
    private HeapUsingIterativeBinaryTree<String, String> tree;

    @Before
    public void setUp() {
        tree = new HeapUsingIterativeBinaryTree<>(Comparator.naturalOrder());
    }

    @Test
    public void testInsertAndFind() {
        // Insertamos asociaciones
        tree.Insert("house", "casa");
        tree.Insert("dog", "perro");
        tree.Insert("cat", "gato");

        // Buscamos las asociaciones
        assertEquals("casa", tree.Find("house"));
        assertEquals("perro", tree.Find("dog"));
        assertEquals("gato", tree.Find("cat"));
    }

    @Test
    public void testNotFound() {
        // El árbol está vacío, debe devolver null
        assertNull(tree.Find("house"));

        // Insertamos una asociación
        tree.Insert("house", "casa");

        // Buscamos una clave que no existe
        assertNull(tree.Find("dog"));
    }

    @Test
    public void testInsertDuplicates() {
        // Insertamos dos veces la misma clave
        tree.Insert("house", "casa");
        tree.Insert("house", "home");

        // Solo debe mantener una de las asociaciones
        assertEquals("casa", tree.Find("house"));
    }
}
