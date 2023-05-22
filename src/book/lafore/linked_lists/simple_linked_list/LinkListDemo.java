package book.lafore.linked_lists.simple_linked_list;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkList list = new LinkList();
		
		list.insertFirst(5, 2.5);
		list.insertFirst(2, 33.2);
		list.insertFirst(14, 6.9);
		list.insertFirst(110, 1.1);
		
		list.displayList();
		
		list.deleteFirst();
		
		System.out.println("=====");
		
		list.displayList();

	}

}
