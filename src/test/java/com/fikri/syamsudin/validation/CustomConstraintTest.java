package com.fikri.syamsudin.validation;


import com.fikri.syamsudin.validation.model.Book;
import org.junit.jupiter.api.Test;

public class CustomConstraintTest extends AbstractTest {

    @Test
    void bookTestLowerCase() {
        Book book = new Book();
        book.setId("book id ");
        book.setName("naruto");

        this.validate(book);
    }

    @Test
    void bookTestUpperCase() {
        Book book = new Book();
        book.setId("BOOKID_001");
        book.setName("naruto");

        this.validate(book);
    }
}
