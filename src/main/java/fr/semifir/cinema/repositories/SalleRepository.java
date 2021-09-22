package fr.semifir.cinema.repositories;

import fr.semifir.cinema.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalleRepository extends MongoRepository<Salle, String> {
}
