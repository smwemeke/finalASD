package edu.miu.cs489.finalasd.repository;

import edu.miu.cs489.finalasd.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
