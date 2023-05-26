package book.lafore.linked_lists.queue_linkedlist;

public class Demo {
    public static void main(String[] args) throws Exception {

        LinkQueue queue = new LinkQueue();

        queue.insert(20);
        queue.insert(40);

        queue.displayQueue();

        System.out.println();
        System.out.println("============");

        queue.insert(60);
        queue.insert(80);

        queue.displayQueue();

        System.out.println();
        System.out.println("============");

        queue.remove();
        queue.remove();

        queue.displayQueue();

    }
}
