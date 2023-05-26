package book.lafore.linked_lists.queue_linkedlist;

/*
 * для реализации очереди, в текущем списке будет два указателя: first / last
 * */
public class LinkList {
    private Link first;
    private Link last;

    public LinkList() {
    }

    public void insertLast(long data) {
        Link newLink = new Link(data);
        if (this.isEmpty()) {
            // если список пуст - новый эл-т явл. первым и последним одновременно
            first = newLink;
            last = newLink;
        } else {
            // если не пуст - новый эл-т будет следом за последним
            last.next = newLink;
            // а также не забываем сместить указатель last (т.е. сказать, что теперь
            // последний эл-т - это новый)
            last = newLink;
        }
    }

    public Long deleteFirst() throws Exception {
        // если список пуст - удаляеть нечего
        if (this.isEmpty()) throw new Exception("List is empty. Deletion is impossible.");
        // иначе - сохраним первый эл-т (т.е. его данные)
        long deletedData = first.data;
        // и поменяем указатель на первый эл-т (теперь первый - это следующий эл-т)
        first = first.next;
        return deletedData;
    }

    public void displayList(){
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
}
