package book.lafore.linked_lists.simple_linked_list;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkList list = new LinkList();
		
		list.insertFirst(5, 2.5);
		list.insertFirst(2, 33.2);
		list.insertFirst(14, 6.9);
		list.insertFirst(110, 1.1);

		// вывод списка
		list.displayList();

		// поиск
		Link elem = list.find(110);
		if (elem == null){
			System.out.println("No such element in the list");
		}else {
			System.out.print("Bingo: ");
			elem.displayLink();
		}

		System.out.println("===========");

		// удаление
		Link deleted = list.delete(110);
		if (deleted == null){
			System.out.println("Can't delete");
		}else {
			System.out.print("Remove success: " );
			deleted.displayLink();
		}


	}

}
