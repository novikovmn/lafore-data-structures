package book.lafore.linked_lists.stack_linkedlist;


/*
* реализуем стек на базе связного списка
* */

public class LinkStack {

    private LinkList list;

    public LinkStack() {
        this.list = new LinkList();
    }

    // вставка в начало стека
    public void push(long data){
        list.insertFirst(data);
    }

    // извлекаем эл-т из вершины стека
    public long pop(){
        return list.deleteFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void displayStack(){
        list.displayList();
    }
}
