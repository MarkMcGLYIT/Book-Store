package ie.lyit.testers;

import ie.lyit.serialize.BookSerializer;
import ie.lyit.book.Menu;

public class BookSerializerTester {

	public static void main(String[] args) {
		BookSerializer bookSerializer = new BookSerializer();
		
		bookSerializer.deserializeBooks();
		
		//Menu menuObj=new Menu();
		
		//do {
			//menuObj.display();
			//menuObj.readOption();
			//switch(menuObj.getOption()) {
				//case 1:	bookSerializer.add(); break;
				//case 2:	bookSerializer.list(); break;
				//case 3:	bookSerializer.view(); break;
				//case 4:	bookSerializer.edit(); break;
				//case 5:	bookSerializer.delete(); break;
				//case 6:	break;
				//default:System.out.println("INVALID OPTION...");
			//}
		//}while(menuObj.getOption() != 6);
		
		//bookSerializer.serializeBooks();
		// Add two records to the ArrayList
		bookSerializer.add();
		bookSerializer.add();
				
		// Write the ArrayList to File
		bookSerializer.serializeBooks();

		
		// Read the ArrayList from the File
		//bookSerializer.deserializeBooks();
		
		// List all the books in the ArrayList
		//bookSerializer.list();
	}
}
