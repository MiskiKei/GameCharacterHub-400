package com.example.GameCharacterHub.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long playerid;
	private String firstName, lastName, email;
	
	public Player() {
		// Default constructor with no arguments
	}
	
    // Constructor
    public Player(String firstName, String lastName, String email) {
    	super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //SETTERS AND GETTERS
    
	public long getPlayerid() {
		return playerid;
	}

	public void setPlayerid(long playerid) {
		this.playerid = playerid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
