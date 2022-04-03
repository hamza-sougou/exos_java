package com.supinfo.java.exoBanque;

import java.time.LocalDate;

public class CompteCourant extends Compte {
	private int decouvert;
	
	public CompteCourant()
	{
		super();
	}
	
	public CompteCourant(int solde, LocalDate dateOuverture,
			   String nomClient, String prenomClient, int decouvert)
	{
		super(solde, dateOuverture, nomClient, prenomClient);
		this.decouvert = decouvert;
	}

	public int getDecouvert() 
	{
		return decouvert;
	}

	public void setDecouvert(int decouvert) 
	{
		this.decouvert = decouvert;
	}

	@Override
	public String toString() 
	{
		return super.toString() + ", decouvert=" + decouvert + "]";
	}
	
	@Override
	public String getNomComplet() 
	{
		return "Client: " + super.getPrenomClient() + " " + super.getNomClient();
	}
	
	
	
}
	
	
