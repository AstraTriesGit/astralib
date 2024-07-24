package org.astralib.books.services;

import org.astralib.books.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, String> {

}
