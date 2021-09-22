package fr.semifir.cinema.services;

import fr.semifir.cinema.models.Film;
import fr.semifir.cinema.repositories.FilmRepository;

import java.util.List;
import java.util.Optional;

public class FilmServiceImpl implements FilmService{

    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository){
        this.filmRepository=filmRepository;
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Optional<Film> findById(String id) {
        return this.filmRepository.findById(id);
    }

    @Override
    public Film save(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public Film put(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public String delete(String id) {
        this.filmRepository.deleteById(id);
        return id+" a bien été supprimé !";
    }
}
