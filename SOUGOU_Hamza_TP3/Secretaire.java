package com.supinfo.java.TP3;

public class Secretaire extends Personne {

	private int numBureau;
	private static int nbSecretaire = 0;
	
	public Secretaire()
	{
		super();
	}
	
	public Secretaire(long id, String nom, String prenom,
			String rue, String ville, int numBureau)
	{
		super(id, nom, prenom, rue, ville);
		this.numBureau = numBureau;
		nbSecretaire++;
	}

	public int getNumBureau() 
	{
		return numBureau;
	}

	public void setNumBureau(int numBureau)
	{
		this.numBureau = numBureau;
	}

	@Override
	public String toString() 
	{
		return super.toString() + ", Numero de Bureau =" + numBureau + "]";
	}
	
	public void ecrirePersonne()
	{
		System.out.println ("Secrétaire : " + toString());
	}
	
	 static int nbSecretaire() 
	 { 
		 return nbSecretaire; 
	 }

}
