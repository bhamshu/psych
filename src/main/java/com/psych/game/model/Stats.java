package com.psych.game.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="stats")
public class Stats extends Auditable{
	@Getter @Setter
	private long correctAnswers = 0;
	
	@Getter @Setter
	private long gotPsychedCount = 0;
	
	@Getter @Setter
	private long psychedOthersCount = 0;
}
