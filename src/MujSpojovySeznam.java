import java.util.Iterator;

public class MujSpojovySeznam implements Iterable<Integer> {

    private Node head;
    private Node tail;
    private int size;

    public MujSpojovySeznam(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
        size++;
    }

    public String toString(){
        String text = "";
        Node curr = head;
        while(curr != null){
            text += curr.value + " ";
            curr = curr.next;
        }
        return text;
    }



    public int size(){
        return size;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator(this);
    }
}
