package com.example.GameCharacterHub.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GameCharacterHub.domain.Character;
import com.example.GameCharacterHub.domain.CharacterRepository;

@RestController
public class CharacterController {
	
	@Autowired
	private CharacterRepository characterRepository;
	
	@RequestMapping("/characters")
	public Iterable<Character> getCharacters(){
		return characterRepository.findAll();
	}

}
