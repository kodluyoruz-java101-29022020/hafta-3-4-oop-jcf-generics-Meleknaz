package generic.sample;

public class Main {

	public static void main(String[] args) {
		
		  LinkedListAlgorithm<String> LinkedList = new LinkedListAlgorithm<>();

	       	LinkedList.addElement("Melek");
	        LinkedList.addElement("Yakup");
	        LinkedList.writeListElements();

	       
	        System.out.println(LinkedList.size());

	        
	        LinkedList.removeElement("Melek");
	        LinkedList.writeListElements();
	        System.out.println(LinkedList.size());

	        
	        LinkedList.addElement("Naz");
	        LinkedList.addElement("Melike");
	        LinkedList.writeListElements();

	
	        System.out.println(LinkedList.size());
	        LinkedList.removeElement("Naz");
	        LinkedList.writeListElements();

	        System.out.println(LinkedList.size());

	}

}
