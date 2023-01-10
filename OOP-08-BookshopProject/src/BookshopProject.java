
public class BookshopProject {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		Book[] book = new Book[3];
		
		person[0] = new Person("Thiago", 27, "Male");
		person[1] = new Person("Rhuan", 32, "Male");
		person[2] = new Person("Whitney", 65, "Female");
		
		book[0] = new Book("Harry Potter", "J.K. Rowling", 250, person[0]);
		book[1] = new Book("The Book Thief", "Markus Zusak", 480, person[1]);
		book[2] = new Book("Hunger Games", "Suzanne Collins", 330, person[2]);
		
	
		book[0].open();
		book[0].skim(100);
		book[0].nextPage();
		
		System.out.println(book[0].toString());
		System.out.println();
		System.out.println(book[1].toString());
		System.out.println();
		System.out.println(book[2].toString());	

	}

}
