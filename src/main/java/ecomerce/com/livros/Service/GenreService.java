package ecomerce.com.livros.Service;

import ecomerce.com.livros.Repository.GenreRepository;
import ecomerce.com.livros.domain.genre.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre getGenreById(Long id) {
        var genre = genreRepository.findById(id);
        return genre;
    }
}
