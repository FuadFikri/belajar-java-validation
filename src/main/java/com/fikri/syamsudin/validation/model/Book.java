package com.fikri.syamsudin.validation.model;

import com.fikri.syamsudin.validation.constraints.CheckCase;
import com.fikri.syamsudin.validation.model.enums.CaseMode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.groups.Default;

public class Book {

    @NotBlank
    @CheckCase(groups = Default.class, message = "{book.id.upper}", mode = CaseMode.UPPER_CASE)
    private String id;

    @NotBlank
    private String name;
    private String category;


    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
