package com.psych.game.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="player_answers")
public class PlayerAnswer extends Auditable{
	@Getter @Setter @NotBlank
	private String answer;
	
	@ManyToOne
	@Getter @Setter
	@NotNull
	private Round round;	
	
	@ManyToOne
	@Getter @Setter @NotNull
	private Player player;
}
