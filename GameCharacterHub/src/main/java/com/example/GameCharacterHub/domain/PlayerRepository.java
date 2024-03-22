package com.example.GameCharacterHub.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlayerRepository extends CrudRepository<Player, Long> {
	Optional<Player> findByFirstname(String firstName);
}
