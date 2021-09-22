package fr.semifir.cinema.config;

import fr.semifir.cinema.repositories.FilmRepository;
import fr.semifir.cinema.repositories.SalleRepository;
import fr.semifir.cinema.repositories.SeanceRepository;
import fr.semifir.cinema.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilmService filmService(FilmRepository filmRepository){
        return new FilmServiceImpl(filmRepository);
    }

    @Bean
    public SalleService salleService(SalleRepository salleRepository){
        return new SalleServiceImpl(salleRepository);
    }

    @Bean
    public SeanceService seanceService(SeanceRepository seanceRepository){
        return new SeanceServiceImpl(seanceRepository);
    }
}
