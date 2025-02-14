package com.tpo.progra_III.repository;

import com.tpo.progra_III.entity.MovieEntity;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface MovieRepository extends ReactiveNeo4jRepository<MovieEntity,
        String> {
    Mono<MovieEntity> findOneByTitle(String title);
}