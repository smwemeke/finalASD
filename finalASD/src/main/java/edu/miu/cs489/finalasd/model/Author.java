package edu.miu.cs489.finalasd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity(name= "author")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(
                    name = "author_book",
                    joinColumns = @JoinColumn(name ="author_id"),
                    inverseJoinColumns = @JoinColumn(name = "book_id")
            )
    private Set<Book> books;
}
