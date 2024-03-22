package com.example.GameCharacterHub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.GameCharacterHub.domain.CharacterRepository;


@SpringBootApplication
public class GameCharacterHubApplication {
	private static final Logger logger = LoggerFactory.getLogger(GameCharacterHubApplication.class);
	
	@Autowired
	private CharacterRepository characterRepository;

	public static void main(String[] args) {
		SpringApplication.run(GameCharacterHubApplication.class, args);
	}

}
