package hospitalManagementSystem;

/*
 *  Class Node which is a Generic type it is used by List to set and get nodes
 * 
 * @author ms
 */
public class Node<E> {

    /**
     * The data value.
     */
    private E data;
    /**
     * A node to link nodes
     */
    private Node<E> next;

    /**
     * Construct a node with the given data value and link
     *
     * @param data - The data value
     * @param next - The link is null
     */
    Node(E data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Construct a node with the given data value and link
     *
     * @param data - The data value
     * @param next - The link
     */
    Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    /*
     * The Data getter to display the object or item data
     */
    public E getData() {
        return data;
    }

    /*
     * The Data setter to set a new object 
     */
    public void setData(E data) {
        this.data = data;
    }

    /*
     * The Node getter to get next node in the link
     */
    public Node<E> getNext() {
        return next;
    }

    /*
     * The Node getter to get next node in the link
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

}
