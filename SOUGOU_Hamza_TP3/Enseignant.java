package com.supinfo.java.TP3;

public class Enseignant extends Personne 
{
	private String specialite;
	private static int nbEnseignant = 0;
	
	public Enseignant() 
	{
		super();

	}
	
	public Enseignant(long id, String nom, String prenom,
			String rue, String ville, String specialite)
	{
		super(id, nom, prenom, rue, ville);
		this.specialite = specialite;
		nbEnseignant++;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public String toString () 
	{
		 return super.toString() + ", Spécialité : " + specialite;
    }
	
	public void ecrirePersonne()
	{
		System.out.println ("Enseignant : " + toString());
	}
	
	static int nbEnseignant () 
	{ 
		return nbEnseignant; 
	}
	
}
