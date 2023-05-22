package book.lafore.linked_lists.two_side_linked_list;

public class TwoSideLinkedList {

    private Link first; // указатель на первый эл-т
    private Link last; // указатель на последний эл-т

    public TwoSideLinkedList() {
        // указатели равны null (т.к. список пустой)
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long data) {
        Link newLink = new Link(data);

        if (this.isEmpty()) {
            // если список пуст - то наш новый эл-т будет еще
            // и последним
            last = newLink;
        }

        // указатель first говорит о том, что
        // теперь новый эл-т первый (не забываем, что здесь происходит вставка в начало)
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long data) {
        Link newLink = new Link(data);
        if (this.isEmpty()) {
            // если список пустой -
            // first и last указатели ведут к навому эл-ту
            first = newLink;
            last = newLink;
        } else {
            // иначе наш новый эл-т последний
            last.next = newLink;
            last = newLink;
        }
    }

    public Long deleteFirst() {
        Long deletedData = first.data;
        first = first.next;
        return deletedData;
    }

    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

}
