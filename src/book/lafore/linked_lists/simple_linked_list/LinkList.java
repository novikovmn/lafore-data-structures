package book.lafore.linked_lists.simple_linked_list;

/*
 * 		У нас буде простой связный список, который поддерживает следующие операции:
 *  - вставка в начало;
 *  - удаление из начала списка;
 *  - вывод содержимого.
 *  
 * */

public class LinkList {
	
	private Link first; // ссылка на первый элемент

	public LinkList() {		
		this.first = null; // создав список - элементов в нем еще нет
	}
	
	public boolean isEmpty() {
		return this.first == null; // пустой список или нет
	}
	
	// вставка в начало
	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.next = first;
		first = newLink;		
	}
	
	// удаление из начала (если список пуст - вернется null)
	public Link deleteFirst() {
		// перехватываем текущий первый элемент (именно его мы будем удалять и вернем, в качестве удаленного элемента) 
		Link temp = first;
		// скажем, что теперь первым будет следующий в списке элемент
		first = first.next;
		// вернем уделенный элемент
		return temp;
	}
	
	// перебор элементов списка
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
