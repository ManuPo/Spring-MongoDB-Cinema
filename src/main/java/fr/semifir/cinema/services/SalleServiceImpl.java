package fr.semifir.cinema.services;

import fr.semifir.cinema.models.Salle;
import fr.semifir.cinema.repositories.SalleRepository;

import java.util.List;
import java.util.Optional;

public class SalleServiceImpl implements SalleService{

    private SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository){
        this.salleRepository=salleRepository;
    }

    @Override
    public List<Salle> findAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Optional<Salle> findById(String id) {
        return this.salleRepository.findById(id);
    }

    @Override
    public Salle save(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle put(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public String delete(String id) {
        this.salleRepository.deleteById(id);
        return id+" a bien été supprimé !";
    }
}
