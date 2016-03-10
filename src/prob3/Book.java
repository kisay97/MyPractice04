package prob3;

public class Book {
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	public Book(){
		
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

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

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	public void rent(){
		if(getStateCode() == 1){
			System.out.println(getTitle() + "이(가) 대여 됐습니다.");
			setStateCode(0);
		}
		else{
			System.out.println(getTitle() + "은(는) 이미 대여 중입니다.");
		}
	}
	
	public static void displayBookInfo(Book books[]){
		for (Book book : books) {
			System.out.print(book.getBookNo() + ". " + book.getTitle() + "(저자 : " + book.getAuthor() + ") : ");
			if(book.getStateCode() == 1)
				System.out.println("재고 있음");
			else
				System.out.println("대출 중");
		}
	}
}
