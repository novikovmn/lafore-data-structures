package book.lafore.linked_lists.stack_linkedlist;

public class Link {
    public long data;
    public Link next;

    public Link(long data) {
        this.data = data;
    }

    public void displayLink(){
        System.out.print(data + " ");
    }
}
