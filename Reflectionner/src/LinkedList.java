class Node<T>{
    T value;
    Node<T> next;
    Node<T> previous;
    public Node(T x){
        value = x;
    }
}


public class LinkedList<T extends Number> {
    public Node<T> head;
    public Node<T> tail;
    public int qanak = 0;



    void pushBack(T x){
        Node<T> k = new Node<>(x);
        if(head == null){
            head = k;
            tail = k;
        }else{
            tail.next = k;
            k.previous = tail;
            tail = k;
        }
        qanak++;
    }
    //clone(); // Linkedliast a = new ...,  Linkedlist b = enw ...;  a = b.clone();
    void pushFront(T x){
        Node<T> k = new Node<>(x);
        if(head == null){
            head = k;
            tail = k;
        }else{
            k.next = head;
            head.previous = k;
            head = k;
        }
        qanak++;
    }
    void insert(int index, T tiv){
        if(index < 0){
            //throw new RanggIndexException("sahmanic durs: nermucvel e",0,qanak,index);
        }
        Node<T> n = new Node<>(tiv);
        Node<T> k = head;
        if(index == 1){
            n.next= head;
            head.previous = k;
            head = n;
            return;

        }
        for(int i = 1; i < index; i++){
            k = k.next;
        }
        if(k.previous != null){
            n.previous = k.previous;
            k.previous.next = n;
            n.next = k;
            k.previous = n;
        }else if(k.next == null){
            tail.next = n;
            n.previous = tail;
            tail = n;
        }
    }
    T get(int hamar){
        if(hamar < 0 | hamar >= qanak){
            //return 0;
            //throw new RanggIndexException("sahmanic durs: nermucvel e",0,qanak,hamar);
        }
        Node<T> k = head;
        if(hamar == 0){
            return k.value;
        }else {
            for (int i = 0; i < hamar; i++) {
                k = k.next;
            }
        }
        return k.value;
    }

    void remove(int index) { //aranc manrakrkitgcgri chem endunelu
        if(index==1){
            head = head.next;
            head.previous = null;
            return;
        }

        Node<T> k = head;
        for (int i = 0; i < index; i++) {
            k = k.next;
        }
        if (k == null) {
            return;
        }
        if (k.previous != null) {
            k.previous.next = k.next;
        } else {
            head = k.next;
        }
        if (k.next== null) {
            k.previous.next = k.previous;
        }
        qanak--;
    }
    void tpel(){
        Node<T> k = head;
        while(k != null){
            System.out.println(k.value+"");
            k = k.next;
        }

    }
    boolean contains(T x){
        Node<T> k = head;
        while (k != null){
            if(k.value == x){
                return true;
            }
            k = k.next;
        }
        return false;
    }
    void revers_tpel(){
        Node<T> k = tail;
        while(k != null){
            System.out.println(k.value+"");
            k = k.previous;
        }
    }
    void delete_skizb(){
        Node<T> k = head;
        k = head.next;
        head = k;
        head.previous = null;
        qanak--;
    }
    void delete_verj(){
        Node<T> k = tail;
        k = tail.previous;
        tail = k;
        tail.next = null;
        qanak--;
    }

    public boolean equals(LinkedList k2){
        if(qanak!=k2.qanak){
            return false;
        }
        Node<T> n = head;
        Node<T> m = k2.head;
        while (m != null){
            if(n.value != m.value){
                return false;
            }
            m = m.next;
            n = n.next;
        }

        for(int i = 0; i < qanak; i++){
            if(n.value != m.value){
                return false;
            }
            m = m.next;
            n = n.next;
        }

        return true;
    }



}