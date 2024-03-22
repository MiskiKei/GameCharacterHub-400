package com.example.GameCharacterHub.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CharacterRepository extends CrudRepository<Character, Long> {
    // Fetch characters by name
    List<Character> findByName(@Param("name") String name);

    // Fetch characters by class
    List<Character> findByCharacterClass(@Param("characterClass") String characterClass);

    // Fetch characters by skill
    List<Character> findBySkill(@Param("skill") String skill);

    // Fetch characters by equipment
    List<Character> findByEquipment(@Param("equipment") String equipment);

}
