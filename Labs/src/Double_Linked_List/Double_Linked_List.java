package Double_Linked_List;

public class Double_Linked_List<E> {

    private Node head;
    private Node tail;
    private int size;

    public int Size() {
        return this.size;
    }

    public boolean IsEmpty() {
        return Size() == 0; // or head.getNext() == null && tail.getNext() == null; 
    }

    public void Adding(E data) {
        Node newNode = new Node(data);
        if (IsEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;

        }
        size++;
    }

    public void Deleting(E data) {
        if (IsEmpty()) {
            System.out.println("it is Empty Sir ...!");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.getNext().getData() == data) {
                    temp.getNext().getNext().setPrev(temp);
                    temp.setNext(temp.getNext().getNext());
                    size--;
                    break;
                }

                temp = temp.getNext();
            }
        }
    }

    public void dispaly() {
        if (IsEmpty()) {
            System.out.println("it is Empty Sir ...!");
        } else {
            Node temp = head;
            System.out.print("null ");
            while (temp != null) {
                System.out.print(" <---> " + temp.getData());
                temp = temp.getNext();
            }
            System.out.println(" <---> null");
        }
    }

    class Node<E> {

        private E data;
        private Node<E> next;
        private Node<E> prev;

        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

    }
}
