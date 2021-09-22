package fr.semifir.cinema.repositories;

import fr.semifir.cinema.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeanceRepository extends MongoRepository<Seance, String> {
}
