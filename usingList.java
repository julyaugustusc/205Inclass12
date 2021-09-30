package usingList;

public class usingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.addFirst("Janaka");
		list1.addFirst("Thilian");
		list1.addFirst("Samira");
		
		
		ListIterator it=list1.listIterator();
		System.out.println(it.next());
		System.out.println(it.next());
		

	}

}