package com.supinfo.java.exoBanque;

import java.time.LocalDate;

public abstract class Compte {
	private long numero;
	private int solde;
	private LocalDate dateOuverture;
	private String nomClient;
	private String prenomClient;
	private static int compteur = 0;
	
	public Compte() 
	{
		Compte.compteur++;
		this.numero = Compte.compteur;
	}
	
	public Compte(int solde, LocalDate dateOuverture,
		   String nomClient, String prenomClient)
	{
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
	}

	public int getSolde() 
	{
		return solde;
	}

	public void setSolde(int solde)
	{
		this.solde = solde;
	}

	public LocalDate getDateOuverture() 
	{
		return dateOuverture;
	}

	public void setDateOuverture(LocalDate dateOuverture) 
	{
		this.dateOuverture = dateOuverture;
	}

	public String getNomClient()
	{
		return nomClient;
	}

	public void setNomClient(String nomClient) 
	{
		this.nomClient = nomClient;
	}

	public String getPrenomClient()
	{
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient)
	{
		this.prenomClient = prenomClient;
	}

	public long getNumero() 
	{
		return numero;
	}
	
	public abstract String getNomComplet();

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ","
				+ " dateOuverture=" + dateOuverture + ", nomClient="
				+ nomClient + ", prenomClient=" + prenomClient + "]";
	}
	
	
	
	
	
}
