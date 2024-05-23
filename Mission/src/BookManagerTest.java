import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {
    private BookManager bookManager;

    @BeforeEach
    void setUp() {
        bookManager = new BookManager();
    }

    @Test
    void testAddBook() {
        String result = bookManager.addBook(1, "자바 기초", "Jane", 2021);
        System.out.println(result);
        assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}도서가 추가되었습니다.", result);
        result = bookManager.addBook(1, "자바 기초", "Jane", 2021);
        System.out.println(result);
        assertEquals("해당 ID(1) 는 이미 존재합니다.", result);
    }

    @Test
    void testSearchBook() {
        bookManager.addBook(1, "자바 기초", "Jane", 2021);
        String result = bookManager.searchBook(1);
        System.out.println("검색 결과: ");
        System.out.println(result);
        assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}", result);
        result = bookManager.searchBook(2);
        System.out.println(result);
        assertEquals("검색된 도서가 없습니다.", result);
    }

    @Test
    void testRemoveBook() {
        bookManager.addBook(1, "자바 기초", "Jane", 2021);
        String result = bookManager.removeBook(1);
        System.out.println(result);
        assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}도서를 삭제하였습니다.", result);
        result = bookManager.removeBook(1);
        System.out.println(result);
        assertEquals("해당 ID(1)의 도서를 찾을 수 없습니다.", result);
    }
}
