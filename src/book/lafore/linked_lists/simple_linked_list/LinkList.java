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
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    // поиск конкретного элемента
    public Link find(int key) {
        // указатель на первый элемент (а делее - на все последующие)
        Link current = first;
        // проверка данных каждого элемента списка пока не найдем нужное
        while (current.iData != key) {
            // если у текущего эл-та нет искомых данных,
            // переходим на следующий эл-т (предварительно убедившись, что он есть).
            // если след. эл-та нет - значит мы дошли до конца (т.е. ничего не найдено)
            if (current.next == null) return null;
            // если след. эл-т есть - двигаем курсор на него
            current = current.next;
        }
        // вернем либо искомый эл-т
        return current;
    }

    // удаление конкретного элемента
    public Link delete(int key) {
		// текущий эл-т
        Link current = first;
		// мы должны знать о предыдущем элементе,
		// чтобы при нахождении искомого "перешагнуть" его (т.е. удалить)
        Link previous = first;

		// логика поиска эл-та
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
			// если искомый эл-т первый
            first = first.next;
        } else {
			// если искомый эл-т НЕ первый
			previous.next = current.next;
        }

		// вернем удаленный эл-т
		return current;
    }


}
