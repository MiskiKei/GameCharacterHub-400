package com.example.GameCharacterHub;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.GameCharacterHub.domain.Character;
import com.example.GameCharacterHub.domain.CharacterRepository;
import com.example.GameCharacterHub.domain.Player;
import com.example.GameCharacterHub.domain.PlayerRepository;

@SpringBootApplication
public class GameCharacterHubApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(GameCharacterHubApplication.class);

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public static void main(String[] args) {
        SpringApplication.run(GameCharacterHubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Initialize data for players
        Player player1 = new Player("Miski", "Kei", "Miski.Kei@example.com");
        Player player2 = new Player("Fei", "Sang", "Fei.Sang@example.com");
        Player player3 = new Player("Kane", "Feng", "Kane.Feng@example.com");
        playerRepository.saveAll(Arrays.asList(player1, player2, player3));

        // Initialize data for characters
        Character character1 = new Character("Nova Silverleaf", "Warrior", "Sword Mastery", "Legendary Sword", 20, 80, 60, 70, player1);
        Character character2 = new Character("Ember Blazeheart", "Mage", "Flame Nova", "Staff of Power", 18, 60, 70, 80, player2);
        Character character3 = new Character("Pyra Skywatcher", "Healer", "Divine Light", "Healing Staff", 18, 60, 70, 80, player3);
        characterRepository.saveAll(Arrays.asList(character1, character2, character3));

        // Log the saved characters
        for (Character character : characterRepository.findAll()) {
            logger.info("Name: " + character.getName() + ", Class: " + character.getCharacterClass());
        }
    }
}
