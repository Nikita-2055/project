public class PriorityQueueMap {
    class Node{
        int key;
        int key2;
        double value;
        Node next;
        Node previous;
        public Node(int k,double v,int k2){
            key = k;
            value = v;
            key2 = k2;

        }
    }
    public Node head;
    public Node tail;
    int count = 0;
    int index = 0;

    void push(int k,double v,int k2) {
        if (find(k,v,k2)) {
            update(k,v,k2);
        }
        Node s = new Node(k, v,k2);
        Node e = head;
        if (head == null) {
            head = s;
            tail = s;
            count++;
            return;
        }else if(s.value < head.value){
            head.previous = s;
            s.next = head;
            head = s;
            count++;
            return;
        }else if(s.value > tail.value){
            tail.next = s;
            s.previous = tail;
            tail = s;
            count++;
            return;
        }
        else{
            while(e != null){
                if(s.value < e.value){
                    e.previous.next = s;
                    s.previous = e.previous;
                    s.next = e;
                    e.previous = s;
                    return;
                }
                e = e.next;
            }
        }

    }

    void update(int k,double v,int k2){
        Node a = head;
        while (a != null){
            if(a.key == k){
                a.key2 = k2;
                a.value = v;
            }
            a = a.next;
        }
    }

    boolean find(int k,double v,int k2){
        Node a = head;
        while (a != null){
            if(a.key == k){
                a.value = v;
                return true;
            }
            a = a.next;
        }
        return false;
    }


    Zuyg pop(){
        Zuyg j = new Zuyg(head.key, head.value, head.key2);
        head = head.next;
        //head.previous = null;
        return j;
    }

    public boolean isEmpty() {
        return head == null;
    }


    boolean equals(PriorityQueueMap p){
        if(count != p.count){
            return false;
        }
        Node s = head;
        Node c = p.head;
        for(int i = 0; i < count; i++){
            if(s.key != c.key || s.value != c.value){
                return false;
            }
        }
        return true;
    }
    void print(){
        Node r = head;
        while (r != null){
            System.out.println("key = "+r.key+"  value = "+r.value);
            r = r.next;
        }
    }

}
