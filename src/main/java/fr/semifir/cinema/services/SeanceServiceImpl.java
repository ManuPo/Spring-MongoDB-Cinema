package fr.semifir.cinema.services;

import fr.semifir.cinema.models.Seance;
import fr.semifir.cinema.repositories.SeanceRepository;

import java.util.List;
import java.util.Optional;

public class SeanceServiceImpl implements SeanceService{

    private SeanceRepository seanceRepository;

    public SeanceServiceImpl(SeanceRepository seanceRepository){
        this.seanceRepository=seanceRepository;
    }

    @Override
    public List<Seance> findAll() {
        return this.seanceRepository.findAll();
    }

    @Override
    public Optional<Seance> findById(String id) {
        return this.seanceRepository.findById(id);
    }

    @Override
    public Seance save(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Seance put(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public String delete(String id) {
        this.seanceRepository.deleteById(id);
        return id+" a bien été supprimé !";
    }
}
