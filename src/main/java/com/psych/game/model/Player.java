package com.psych.game.model;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "players")
public class Player extends Auditable{
	@Getter
	@Setter
	@NotBlank
	private String name;
	
	@Getter @Setter @URL
	private String psychFaceURL;
	
	@Getter @Setter @URL
	private String picURL;
	
	@OneToOne
	@Getter @Setter 
	private Stats stats;
	
	@ManyToMany(mappedBy = "players")
	@Getter @Setter
	private List<Game> games;
	
	@OneToMany(mappedBy = "game")
	@Getter @Setter
	private List<Round> rounds;
}