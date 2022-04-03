package com.supinfo.java.exoBanque;

import java.time.LocalDate;

public class CompteEpargne extends Compte {
	private int interet;
	
	public CompteEpargne()
	{
		super();
	}
	
	public CompteEpargne(int solde, LocalDate dateOuverture,
			   String nomClient, String prenomClient, int interet)
	{
		super(solde, dateOuverture, nomClient, prenomClient);
		this.interet = interet;
	}

	public int getInteret() {
		return interet;
	}

	public void setInteret(int interet) {
		this.interet = interet;
	}
	
	public String toString() 
	{
		return super.toString() + ", interet=" + interet + "]";
	}

	@Override
	public String getNomComplet() {
		return "Client: " + super.getPrenomClient() + " " + super.getNomClient();
	}

}
