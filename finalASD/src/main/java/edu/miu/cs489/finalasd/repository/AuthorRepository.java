package edu.miu.cs489.finalasd.repository;

import edu.miu.cs489.finalasd.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
