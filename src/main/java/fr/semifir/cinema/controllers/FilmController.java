package fr.semifir.cinema.controllers;

import fr.semifir.cinema.models.Film;
import fr.semifir.cinema.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("film")
public class FilmController {

    private FilmService filmService;

    public FilmController(FilmService filmService){
        this.filmService=filmService;
    }

    @GetMapping
    public List<Film> findAll(){
        return this.filmService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Film> findById(@PathVariable String id){
        return this.filmService.findById(id);
    }

    @PostMapping
    public Film save(@RequestBody Film film){
        return this.filmService.save(film);
    }

    @PutMapping
    public Film put(@RequestBody Film film){
        return this.filmService.put(film);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable String id){
        return this.filmService.delete(id);
    }
}
