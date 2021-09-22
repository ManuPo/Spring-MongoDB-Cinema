package fr.semifir.cinema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {

    @Id
    private String id;
    private String date;

    @DBRef
    @Field("film")
    private Film film;

    @DBRef
    @Field("salle")
    private Salle salle;
}
