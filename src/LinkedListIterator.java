import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator implements Iterator<Integer> {

    private MujSpojovySeznam list;
    private Node index;

    public LinkedListIterator(MujSpojovySeznam list){
        this.list = list;
        this.index = list.getHead();
    }


    @Override
    public boolean hasNext() {
        return index != null;
    }

    @Override
    public Integer next() {
        if (hasNext()){
            int cislo = index.value;
            index = index.next;
            return cislo;
        }else {
            throw new NoSuchElementException("Nefunguje to");
        }
    }
}
