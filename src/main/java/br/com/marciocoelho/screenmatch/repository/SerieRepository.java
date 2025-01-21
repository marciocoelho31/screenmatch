package br.com.marciocoelho.screenmatch.repository;

import br.com.marciocoelho.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
