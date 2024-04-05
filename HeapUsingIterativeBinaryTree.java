import java.util.Comparator;

public class HeapUsingIterativeBinaryTree<P, V> {
    private int count;
    private TreeNode<P, V> root;
    private Comparator<P> priorityComparator;
    
    // Constructor
    public HeapUsingIterativeBinaryTree(Comparator<P> priorityComparator) {
        count = 0;
        this.priorityComparator = priorityComparator;
    }
    
    // Getter para count
    public int getCount() {
        return count;
    }

    // Setter para count
    public void setCount(int count) {
        this.count = count;
    }

    // Getter para root
    public TreeNode<P, V> getRoot() {
        return root;
    }

    // Setter para root
    public void setRoot(TreeNode<P, V> root) {
        this.root = root;
    }

    // Getter para priorityComparator
    public Comparator<P> getPriorityComparator() {
        return priorityComparator;
    }

    // Setter para priorityComparator
    public void setPriorityComparator(Comparator<P> priorityComparator) {
        this.priorityComparator = priorityComparator;
    }
    
    // Método para insertar un elemento en el heap
    public void Insert(P priority, V value) {
        // Implementación del método de inserción
    }
    
    // Método para eliminar un elemento del heap
    public void Remove(P priority) {
        // Implementación del método de eliminación
    }
    
    // Método para buscar un elemento en el heap
    public V Find(P priority) {
        // Implementación del método de búsqueda
        return null; // Cambiar el retorno según la implementación
    }
    
    // Método para obtener el número de elementos en el heap
    public int Count() {
        return count;
    }
    
    // Método para verificar si el heap está vacío
    public boolean IsEmpty() {
        return count == 0;
    }
    

}

// Clase interna TreeNode
class TreeNode<P, V> {
    private P priority;
    private V value;
    private TreeNode<P, V> parent;
    private TreeNode<P, V> left;
    private TreeNode<P, V> right;
    
    // Constructor
    public TreeNode(P priority, V value) {
        this.priority = priority;
        this.value = value;
    }
    
    // Getters y setters
    public P getPriority() {
        return priority;
    }

    public void setPriority(P priority) {
        this.priority = priority;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public TreeNode<P, V> getParent() {
        return parent;
    }

    public void setParent(TreeNode<P, V> parent) {
        this.parent = parent;
    }

    public TreeNode<P, V> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<P, V> left) {
        this.left = left;
    }

    public TreeNode<P, V> getRight() {
        return right;
    }

    public void setRight(TreeNode<P, V> right) {
        this.right = right;
    }
}
