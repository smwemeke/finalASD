package edu.miu.cs489.finalasd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    private String title;
    private String isbn;
    @ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
    private Set<Author> author;
}
