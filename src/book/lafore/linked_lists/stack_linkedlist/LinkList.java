package book.lafore.linked_lists.stack_linkedlist;

public class LinkList {
    private Link first;

    public LinkList() {
        // пустой список
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst(){
        long deletedData = first.data;
        first = first.next;
        return deletedData; // возвращаем удаленный элемент
    }

    public void displayList(){
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        // если нужно - сделать перенос строки
    }

}
