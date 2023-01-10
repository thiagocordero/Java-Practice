
public class Book implements Publication {
	
	//Attributes
	private String title;
	private String author;
	private int pages;
	private int currentPage;
	private boolean open;
	private Person reader;
	
	//Constructor
	public Book(String title, String author, int pages, Person reader) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.reader = reader;
		
		this.open = false;
		this.currentPage= 0;
	}
	
	// To String
	@Override
	public String toString() {
		return "Book \ntitle= " + title + "\n author= " + author + "\n pages= " + pages + "\n currentPage= " + currentPage
				+ "\n open= " + open + "\n reader= " + reader.getName();
	}
	
	//Getters e Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public Person getReader() {
		return reader;
	}
	public void setReader(Person reader) {
		this.reader = reader;
	}

	@Override
	public void open() {
		this.open = true;		
	}

	@Override
	public void close() {
		this.open = false;
	}

	@Override
	public void skim(int page) {
		if (page <= this.getPages()) {
			this.currentPage = page;	
		} else {
			System.out.println("ERROR! The last page is: " + this.getPages());
		}
				
	}

	@Override
	public void nextPage() {
		this.currentPage++;		
	}

	@Override
	public void previousPage() {
		this.currentPage--;		
	}
	
}
