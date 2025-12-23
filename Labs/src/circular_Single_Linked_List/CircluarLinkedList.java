package circular_Single_Linked_List;

public class CircluarLinkedList<E> {

    private Node<E> tail = null;
    private int size;

    public CircluarLinkedList() {
        tail = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public void addFirdt(E d) {
        if (isEmpty()) {
            Node newNode = new Node(d, null);
            tail = newNode;
            newNode.setNext(tail);
        } else {
            Node newnod = new Node(d, tail.Next);
            tail.setNext(newnod);

        }
        size++;
    }

    public void addlast(E d) {
        addFirdt(d);
        tail = tail.getNext();

    }

    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getData();
    }

    public E getlast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getData();
    }

    public E removeFrist() {
        if (isEmpty()) {
            return null;
        }
        E delet = tail.getNext().getData();
        if (tail == tail.getNext()) {
            tail = null;
        } else {
            tail.setNext(tail.getNext().getNext());
        }
        size--;
        return delet;
    }
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E delet = tail.getNext().getData();
        if (tail == tail.getNext()) {
            tail = null;
        } else {
            Node temp = tail.getNext();
            while(temp.getNext() != tail){
            temp = temp.getNext();     
            }
            temp.setNext(tail.getNext());
            tail=temp;
        }
        size--;
        return delet;
    }

    class Node<E> {

        private E data;
        private Node<E> Next;

        public Node(E data, Node<E> Next) {
            this.data = data;
            this.Next = Next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return Next;
        }

        public void setNext(Node<E> Next) {
            this.Next = Next;
        }

    }
}
