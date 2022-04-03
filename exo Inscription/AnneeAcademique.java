
package com.supinfo.java.chap2;


public class AnneeAcademique 
{
	private long id;
	private String libelle;
	private String description;
	private static int compteur = 0;
	
	public AnneeAcademique()
	{
		AnneeAcademique.compteur++;
		this.id = AnneeAcademique.compteur;
	}
	
	public AnneeAcademique(String libelle, String description)
	{
		this();
		this.libelle = libelle;
		this.description = description;		
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "AnneeAcademique [id=" + id + ", libelle=" + libelle + ", description=" + description + "]";
	}
	
		
}
