package com.supinfo.java.TP3;

public class Etudiant extends Personne 
{
	private String diplomeEnCours;
	private static int nbEtudiant = 0;
	
	public Etudiant()
	{
		super();

	}
	
	public Etudiant(long id,String nom, String prenom,
			String rue, String ville, String diplomeEnCours)
	{
		super(id, nom, prenom, rue, ville);
		this.diplomeEnCours = diplomeEnCours;
		nbEtudiant++;
	}

	public String getDiplomeEnCours() 
	{
		return diplomeEnCours;
	}

	public void setDiplomeEnCours(String diplomeEnCours)
	{
		this.diplomeEnCours = diplomeEnCours;
	}

	@Override
	public String toString() 
	{
		return super.toString() + ", Diplome en cours =" + diplomeEnCours + "]";
	}
	
	public void ecrirePersonne()
	{
		System.out.println ("Etudiant : " + toString());
	}
	
	 static int nbEtudiant () 
	 { 
		 return nbEtudiant; 
	 }
}
