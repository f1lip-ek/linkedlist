public class Main {
    public static void main(String[] args) {
        MujSpojovySeznam listik = new MujSpojovySeznam();
        listik.addFirst(5);
        listik.addFirst(6);
        listik.addFirst(9);
        listik.addFirst(1);
        listik.addFirst(4);
        listik.addFirst(20);
        listik.addFirst(8);
        listik.addFirst(3);
        listik.addFirst(2);

        LinkedListIterator iterator = (LinkedListIterator) listik.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
