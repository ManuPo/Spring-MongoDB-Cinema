package fr.semifir.cinema.controllers;

import fr.semifir.cinema.models.Seance;
import fr.semifir.cinema.services.SeanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("seance")
public class SeanceController {

    private SeanceService seanceService;

    public SeanceController(SeanceService seanceService){
        this.seanceService=seanceService;
    }

    @GetMapping
    public List<Seance> findAll(){
        return this.seanceService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Seance> findById(@PathVariable String id){
        return this.seanceService.findById(id);
    }

    @PostMapping
    public Seance save(@RequestBody Seance seance){
        return this.seanceService.save(seance);
    }

    @PutMapping
    public Seance put(@RequestBody Seance seance){
        return this.seanceService.put(seance);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable String id){
        return this.seanceService.delete(id);
    }
}
