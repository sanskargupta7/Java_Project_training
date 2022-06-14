package newpkg;

public class Library {
	
	private int bookId;
	private String name;
	private String genre;
	private int cost;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", name=" + name + ", genre=" + genre + ", cost=" + cost + "]";
	}
	public Library(int bookId, String name, String genre, int cost) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.genre = genre;
		this.cost = cost;
	}
	
	static void Comedy() {
		String[] c = new String[3];
		c[0] = "Grand Blue Dreaming";
		c[1] = "Sick in The Head";
		c[2] = "Barakomon";
		
		for(int i = 0; i<3; i++) {
			System.out.println(c[i]);
		}
		System.out.println("");
	}
	
	static void Thriller() {
		String[] t = new String[3];
		t[0] = "Erased";
		t[1] = "Steins;Gate";
		t[2] = "Before I go to Sleep";
		
		for(int i = 0; i<3; i++) {
			System.out.println(t[i]);
		}
		System.out.println("");
	}
	
	static void Romance() {
		String[] r = new String[3];
		r[0] = "A Silent Voice";
		r[1] = "Red, White and Royal Blue";
		r[2] = "The fault in Our Stars";
		
		for(int i = 0; i<3; i++) {
			System.out.println(r[i]);
		}
		System.out.println("");
	}
	
	static void Horror() {
		String[] h = new String[3];
		h[0] = "House of Leaves";
		h[1] = "Blood on the Tracks";
		h[2] = "The Drifting Classroom";
		
		for(int i = 0; i<3; i++) {
			System.out.println(h[i]);
		}
		System.out.println("");
	}
	
	static void fullCat() {
		
	}
	

}
