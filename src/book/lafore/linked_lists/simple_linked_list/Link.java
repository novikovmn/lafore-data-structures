package book.lafore.linked_lists.simple_linked_list;

/*
 *  Экземпляр Link - элемент связного списка (обертка над данными).
 *  	
 * */
public class Link {
	
	/*
	 * здесь, для удобства, все поля public
	 * */
	
	public int iData;	// целоисленные данные
	public double dData;	// данные в виде плавающего числа
	public Link next;	// ссылка на следцющий элемент связного списка
	
	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}
	
	// вывод элемента списка
	public void displayLink() {
		System.out.println("{" + iData + ", " + dData + "}");
	}
	

}
 