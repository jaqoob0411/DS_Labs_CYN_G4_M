package Single_Linde_List;

public class Single_Linde_List<E extends Comparable<E>> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public void addFrist(E data) {
        Node<E> newNode = new Node(data, head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
        }
        size++;
    }

    public E getfrst() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();

    }

    public void addlast(E data) {
        Node<E> lastNode = new Node(data, null);
        if (isEmpty()) {
            head = lastNode;
        } else {
            tail.setNext(lastNode);
        }
        tail = lastNode;
        size++;

    }

    public E getlast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getData();
    }

    public void dispaly() {
        Node<E> temp = head;
//        for (int i = 0; i < size; i++) {
//            System.out.print(temp.getData() + " ---> ");
//            temp = temp.getNext();
//        }
        while (temp != null) {
            System.out.print(temp.getData() + " ---> ");
            temp = temp.getNext();

        }
        System.out.println("null");
    }

    public void addpostion(E data, int postion) {
        //  Node<E> nowNode = new Node(data, null);

        if (postion == 1) {
            addFrist(data);
//           nowNode.setNext(head);
//           head = nowNode;
//           size++;
        } else if (size() < postion) {
            System.out.println("the addtion postion is out the linked list !!!");
        } else if (postion == size() + 1) {
            addlast(data);
//           tail.setNext(nowNode);
//           tail = nowNode;
//           size++;
        } else {
            Node<E> temp = head;
            int cont = 1;
            while (cont < postion - 1) {
                temp = temp.getNext();
                cont++;
            }
            Node<E> nowNode = new Node(data, temp.getNext());
            //  nowNode.setNext(temp.getNext());
            temp.setNext(nowNode);
            size++;
        }
    }

    public void deletFrist() {
        head = head.getNext();
    }

    public void addTenToAllelemant() {
        Node temp = head;
        while (temp != null) {
            temp.setData(temp.getData() + "10");
            temp = temp.getNext();
        }

    }

    public boolean sreaching(E data) {
        Node temp = head;
        if (isEmpty()) {
            return false;
        } else {
            while (temp != null) {
                if (temp.getData() == data) {
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    public void addatlastwithoutSize(E data) {
        Node nowNode;
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.Next = new Node(data, temp.Next);
    }

    public void addelmantbyordar(E data) {

        if (isEmpty()) {
            // Node newnode = new Node(data, head)
            //size++;
            addFrist(data);
            //Instes kof tali.getDate() > data
        } else {
            Node<E> temp = head;
            while (temp.getNext() != null) {
                if (temp.getNext().getData().compareTo(data) > 0) {
                    break;
                }
                temp = temp.getNext();

            }

//            Node newnode = new Node(data, temp.getNext());
//            temp.setNext(newnode); 
            Node newnode;
            temp.Next = new Node(data, temp.Next);

        }

    }

    public void addlist(E data) {

        Node newnode = new Node(data, null);
        if (isEmpty()) {
            head = newnode;
        } else {
            tail.setNext(newnode);
        }
        tail = newnode;
        size++;

    }

    public E removelast() {

        if (isEmpty()) {
            return null;
        }
        E delet = tail.getData();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail = temp;

        }
        size--;
        return delet;
    }
    //---------------------------------------------------------------------------------------------------//
    // deletion

    public void deletonlynode() {
        if (!isEmpty()) {
            head = head.getNext();
        } else {
            System.out.println("The linded lsit is Empty sir ...!");
        }
    }

    public void deletTheFristnode() {
        if (!isEmpty()) {
            head = head.getNext();
        }
    }

    public void deletTheLastNodeWithoutTail() {
        Node<E> temp = head;
        if (!isEmpty()) {
            while (temp.getNext() != null) {
                if (temp.getNext().getNext() == null) {
                    temp.setNext(temp.getNext().getNext());
                    break;
                }
                temp = temp.getNext();
            }
        } else {
            System.out.println("the linked list is empt ????");
        }

    }

    public void deletWithValueFromUser(E value) {
        Node temp = head;
        boolean falgNotExst = true;
        if (!isEmpty()) {
            if (temp.getData() == value) {
                deletFrist();
            } else {
                while (temp.getNext() != null) {
                    if (temp.getNext().getData() == value) {
                        temp.setNext(temp.getNext().getNext());
                        falgNotExst = false;
                        break;

                    }
                    temp = temp.getNext();
                }
                if (falgNotExst) {
                    System.out.println("this value " + value + " is not exi");
                    System.exit(0);
                }
            }
        }
        System.out.println("the lenked list is empty ");
        System.exit(0);
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
