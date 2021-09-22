package fr.semifir.cinema.controllers;

import fr.semifir.cinema.models.Salle;
import fr.semifir.cinema.services.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("salle")
public class SalleController {

    private SalleService salleService;

    public SalleController(SalleService salleService){
        this.salleService=salleService;
    }

    @GetMapping
    public List<Salle> findAll(){
        return this.salleService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Salle> findById(@PathVariable String id){
        return this.salleService.findById(id);
    }

    @PostMapping
    public Salle save(@RequestBody Salle salle){
        return this.salleService.save(salle);
    }

    @PutMapping
    public Salle put(@RequestBody Salle salle){
        return this.salleService.put(salle);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable String id){
        return this.salleService.delete(id);
    }
}
