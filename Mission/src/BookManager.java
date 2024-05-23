import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> booklist;

    public BookManager() {
    	booklist = new ArrayList<>();
    }

    public String addBook(int id, String title, String author, int year) {
        for (Book book : booklist) {
            if (book.getId() == id) {
                return "해당 ID(" + id + ") 는 이미 존재합니다.";
            }
        }
        Book newBook = new Book(id, title, author, year);
        booklist.add(newBook);
        return newBook.toString() + "도서가 추가되었습니다.";
    }

    public String searchBook(int id) {
        for (Book book : booklist) {
            if (book.getId() == id) {
                return book.toString();
            }
        }
        return "검색된 도서가 없습니다.";
    }

    public String removeBook(int id) {
        for (Book book : booklist) {
            if (book.getId() == id) {
            	booklist.remove(book);
                return book.toString() + "도서를 삭제하였습니다.";
            }
        }
        return "해당 ID(" + id + ")의 도서를 찾을 수 없습니다.";
    }
}
