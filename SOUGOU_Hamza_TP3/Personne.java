package com.supinfo.java.TP3;

public abstract class Personne
{
	private long id;
	private String nom;
	private String prenom;
	private String rue;
	private String ville;
	private static int nbPersonnes = 0;
	
	public Personne() {}
	
	public Personne(long id, String nom,
			String prenom, String rue, String ville)
	{
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		nbPersonnes++;
	}

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

    abstract void ecrirePersonne();
	
	public static void nbPersonne() 
	{
		System.out.println(
				"Nombre de personnes : " + nbPersonnes +
				"\n Nombre de Secretaires : " + Secretaire.nbSecretaire() +
				"\n Nombre d'Enseignants : " + Enseignant.nbEnseignant() +
				"\n Nombre d'Etudiants : " + Etudiant.nbEtudiant()
				);
	}

	public void modifierPersonne(String rue, String ville)
	{
		this.rue = rue;
		this.ville = ville;
		ecrirePersonne();
	}
	
	
	@Override
	public String toString() 
	{
		return "Personne [id=" + id + ", nom=" + nom +
				", prenom=" + prenom + ", rue=" + rue + ","
						+ " ville=" + ville + "]";
	}		
	
}
