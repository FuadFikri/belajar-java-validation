package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Book;
import com.fikri.syamsudin.validation.model.group.BookGroup;
import org.junit.jupiter.api.Test;

public class ConstraintCompositionTest extends AbstractTest{


    @Test
    void compositionTest() {
        Book book = new Book();
        book.setId("12345687-abc");
        book.setName("algebra");
        book.setCategory("math");

        this.validateWithGroup(book, BookGroup.class);

    }
}
