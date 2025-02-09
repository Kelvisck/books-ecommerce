package ecomerce.com.livros.domain.book;

import ecomerce.com.livros.domain.author.Author;
import ecomerce.com.livros.domain.genre.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;



}
