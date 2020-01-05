package com.psych.game.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="content_writers")
public class ContentWriter extends Employee{
	@ManyToMany
	@Getter @Setter
	List<Question> editedQuestions;
}