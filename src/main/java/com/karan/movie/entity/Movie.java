package com.karan.movie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "movie")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @NotBlank(message = "title can't be empty")
    private String title;

    @NotBlank(message = "director can't be empty!")
    private String director;

    @NotBlank(message = "studio can't be empty!")
    private String studio;

    @ElementCollection  // please explain it well (i saw this very 1st time)
    @CollectionTable(name = "movie_cast") // please explain it well (i saw this very 1st time)
    private Set<String> movieCast; // what would be the use of it please just let me know.

    @NotNull(message = "pleaes provide releasingYear!")
    private Integer releasingYear;
    @NotBlank(message = "please provide poster!")
    private String poster;

}
