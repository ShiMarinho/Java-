package hospitalManagementSystem;


/*
 * List class to handle generic data in the linked list:
 * functionalities that are provide by the LinkedListInterface rules
 *
 * @author ms
 */
public class List<E> implements LinkedListInterface<E> {

    /* 
        Global variables used by all methods
     */
    private Node head;
    private int size = 0;

    /*
     * Constructor with no arguments
     */
    public List() {
    }

    /*
     * method size to keep track of the list size
     * @param size
     */
    @Override
    public int size() {
        return size;
    }

    /*
     * Method returns the node at specific index
     * @param node
     */
    @Override
    public Node<E> getNode(int index) {
        // node head the first one
        Node node = head;
        //loop throw all the nodes unitl find the one at position index
        for (int i = 1; i < index && node != null; i++) {
            node = node.getNext();
            node.getData();
        }
        //returns the node found by it's index
        return node;
    }

    /*
     * Method update the data at specific index
     * @param node
     */
    @Override

    public void update(int index, E item) {

        remove(index);
        addAt(item, index);
    }

    /*
     * Method adds a item at the end of the list
     */
    @Override
    public void add(E item) {
        ///////// Data to the current \\\\\\\\\
        Node current = new Node(item);    // current node is created
        current.setData(item);           // set data to the current node

        //////// add the pointer to the current \\\\\\\\\
        if (head == null) // if head is null this is the first node
        {
            head = current;         // the head is assigned to current node
        } else {                     // if is not the first node
            Node newNode = head;    // create a newNode for head
            while (newNode.getNext() != null) { // find the last node in the list 
                newNode = newNode.getNext();    // assign newNode to it
            }
            newNode.setNext(current);         // set the newNode the current 
        }
        size++; // increase size of the list
    }

    /*
     * Method to insert a node to a specific position
     */
    @Override
    public void addAt(E item, int index) {

        if (index <= 0 || index > size) { // check if the index is valid
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else { // if the index is valid
            ///////// create a new Node and add Data and node by it's index \\\\\\\\\
            Node newNode = new Node(item, getNode(index));

            ////////// if is the first node addFirst() \\\\\\\\\\\\\\\\\\\\\
            if (index == 1) {
                addFirst(item);
            }

            ///////// if is the first node addFirst() \\\\\\\\\\\\\\\\\\\\\
            Node current = head;
            for (int i = 1; i < index - 1; i++) {

                current = current.getNext();
            }

            ////////// relocate the newNode into the list by pushing the other node to next position in the list\\\\\
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        ///// increase size of the list\\\\\\
        size++;

    }

    /*
     * Method add item at the begining of the list
     */
    @Override
    public void addFirst(E item) {
        head = new Node(item, head); // create a new node for the head pointer
        size++; //increase the list size
    }

    /*
     * Method removes the item by index and connects the to the node behind
     */
    @Override
    public void remove(int index) {
        /*
         * index 1 is the first 
         */
        if (index == 1) {
            head = head.getNext();
        } else {

            Node<E> node = null;
            Node<E> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            node = current.getNext();
            current.setNext(node.getNext());
            size--;
        }
    }

    /*
     * Method removes n items from the end of the list 
     */
    @Override
    public void removeN(int n) {

        for (int i = 0; i < n; i++) {
            remove(size - 1);
        }
    }

    /*
     * Method remove the first item of the list
     */
    public E removeFirst() {
        Node temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            return (E) temp.getData();
        } else {
            return null;
        }
    }


    /*
     * Method to print out all the item in the linked list
     */
    @Override
    public String toString() {
        int counter = 1;
        StringBuilder sb = new StringBuilder("  ==> position: " + counter++ + "\n\n");
        Node p = head;

        if (head != null) {

            while (p.getNext() != null) {
                sb.append(p.getData());
                sb.append("\n ==> position: " + counter++ + "\n\n ");
                p = p.getNext();
            }
            sb.append(p.getData());
        }

        return sb.toString();
    }

}/// end of List class \\\\
