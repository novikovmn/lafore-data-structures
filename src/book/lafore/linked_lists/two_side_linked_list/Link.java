package book.lafore.linked_lists.two_side_linked_list;

public class Link {
    public long data;
    public Link next;

    public Link(long data) {
        this.data = data;
    }

    public void displayLink() {
        System.out.print("{" + data + "}" + " ");
    }
}
