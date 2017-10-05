package com.libertymutual.goforcode.voting.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDataTable")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(unique=true)
	private String userName;
	
	private String firstChoice;
	private String secondChoice;
	private String thirdChoice;
	
	public User(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstChoice() {
		return firstChoice;
	}
	public void setFirstChoice(String firstChoice) {
		this.firstChoice = firstChoice;
	}
	public String getSecondChoice() {
		return secondChoice;
	}
	public void setSecondChoice(String secondChoice) {
		this.secondChoice = secondChoice;
	}
	public String getThirdChoice() {
		return thirdChoice;
	}
	public void setThirdChoice(String thirdChoice) {
		this.thirdChoice = thirdChoice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
