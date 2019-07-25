/*
 * Linked List interface class
 */
package hospitalManagementSystem;

/**
 *
 * @author ms
 */
public interface LinkedListInterface<E> {

    /* return size*/
    public int size();

    /* return a node */
    public Node<E> getNode(int index);

    /* does not return anything by replaces the node with updated data*/
    public void update(int index, E newValue);

    /* add a item in the list */
    public void add(E item);

    /* add a item at a specific index */
    public void addAt(E item, int index);

    /* add a item at the top of the list */
    public void addFirst(E item);

    /* remove a node by it's index */
    public void remove(int index);

    /* remove n nodes from the list*/
    public void removeN(int n);

    /* remove the first item in the list */
    public E removeFirst();

    /* print the list */
    public String toString();
}
