package fr.semifir.cinema.repositories;

import fr.semifir.cinema.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository<Film, String> {
}
