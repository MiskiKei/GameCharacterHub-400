 package com.example.GameCharacterHub.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name, characterClass, skill, equipment;
	private int level, strength, agility, intelligence;

	public Character() {
		// Default constructor with no arguments
	}

	// Constructor
	public Character(String name, String characterClass, String skill, String equipment, int level, int strength, int agility, int intelligence) {
		this.name = name;
		this.characterClass = characterClass;
		this.skill = skill;
		this.equipment = equipment;
		this.level = level;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}
	
	
	//SETTERS AND GETTERS 
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
}
