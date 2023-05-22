package book.lafore.linked_lists.two_side_linked_list;

public class Demo {
    public static void main(String[] args) {

        // создаем двусторонний список
        TwoSideLinkedList list = new TwoSideLinkedList();

        // вставка в начало
        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        // вставка в конец
        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        list.displayList();

        System.out.println("======");

        list.deleteFirst();
        list.displayList();



    }
}
