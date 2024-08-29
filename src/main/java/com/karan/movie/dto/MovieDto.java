package com.karan.movie.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

        private Integer movieId;

        @NotBlank(message = "title can't be empty")
        private String title;

        @NotBlank(message = "director can't be empty!")
        private String director;

        @NotBlank(message = "studio can't be empty!")
        private String studio;

        private Set<String> movieCast; // what would be the use of it please just let me know.

        private Integer releasingYear;

        @NotBlank(message = "please provide poster!")
        private String poster;

        @NotBlank(message = "please provide postUrl!")
        private String postUrl;

}
