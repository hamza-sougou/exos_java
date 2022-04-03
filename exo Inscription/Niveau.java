package com.supinfo.java.chap2;

public class Niveau {
	private long id;
	private String designation;
	private static int compteur = 0;
	
	public Niveau()
	{
		Niveau.compteur++;
		this.id = Niveau.compteur;
	}
	
	public Niveau(String designation)
	{
		this();
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Niveau [id=" + id + ", designation=" + designation + "]";
	}
	
	
	
	
}
