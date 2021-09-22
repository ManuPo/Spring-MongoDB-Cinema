package fr.semifir.cinema.services;

import fr.semifir.cinema.models.Salle;

import java.util.List;
import java.util.Optional;

public interface SalleService {
    List<Salle> findAll();
    Optional<Salle> findById(String id);
    Salle save(Salle salle);
    Salle put(Salle salle);
    String delete(String id);
}
