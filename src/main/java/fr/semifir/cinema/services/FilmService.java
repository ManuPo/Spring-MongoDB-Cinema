package fr.semifir.cinema.services;

import fr.semifir.cinema.models.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<Film> findAll();
    Optional<Film> findById(String id);
    Film save(Film film);
    Film put(Film film);
    String delete(String id);
}
