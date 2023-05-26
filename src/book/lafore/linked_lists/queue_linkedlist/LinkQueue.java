package book.lafore.linked_lists.queue_linkedlist;

public class LinkQueue {
    private LinkList list;

    public LinkQueue() {
        list = new LinkList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    // вставка в конец очереди
    public void insert(long data) {
        list.insertLast(data);
    }

    // извлекаем из начала очереди
    public Long remove() throws Exception {
        return list.deleteFirst();
    }

    public void displayQueue(){
        list.displayList();
    }
}
