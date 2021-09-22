package fr.semifir.cinema.services;

import fr.semifir.cinema.models.Seance;

import java.util.List;
import java.util.Optional;

public interface SeanceService {
    List<Seance> findAll();
    Optional<Seance> findById(String id);
    Seance save(Seance seance);
    Seance put(Seance seance);
    String delete(String id);
}
