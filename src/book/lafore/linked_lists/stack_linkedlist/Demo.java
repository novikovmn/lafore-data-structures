package book.lafore.linked_lists.stack_linkedlist;

public class Demo {
    public static void main(String[] args) {

        LinkStack stack = new LinkStack();

        stack.push(20);
        stack.push(40);

        stack.displayStack();
        System.out.println();
        System.out.println("=======");

        stack.push(60);
        stack.push(80);

        stack.displayStack();
        System.out.println();
        System.out.println("=======");

        stack.pop();
        stack.pop();

        stack.displayStack();

    }
}
