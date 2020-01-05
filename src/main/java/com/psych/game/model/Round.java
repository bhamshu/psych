package com.psych.game.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="rounds")
public class Round extends Auditable{
	@ManyToOne
	@Getter @Setter
	@NotNull
	private Game game;
	
	@ManyToOne
	@Getter @Setter
	private Question question;
	
	@Getter @Setter
	@NotNull
	private int roundNumber;

	@ManyToMany
	@Getter @Setter
	private Map<Player, PlayerAnswer> playerAnswers;
}