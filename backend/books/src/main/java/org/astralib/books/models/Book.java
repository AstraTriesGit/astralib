package org.astralib.books.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @Id
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int edition;
    private int yearOfPublishing;
    private String genre;
}
