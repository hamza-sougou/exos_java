package com.supinfo.java.TP3;

public class TestPersonne 
{

	public static void main(String[] args)
	{
		
		Secretaire secretaire1 = new Secretaire(1, "SALL", "Nabou", "Paul Haull", "Dakar", 34);
		secretaire1.ecrirePersonne();
		
		Enseignant enseignant1 = new Enseignant(1, "BAH", "Mohamed", "HLM", "Thies", "Java");
		enseignant1.ecrirePersonne();
		
		Enseignant enseignant2 = new Enseignant(2, "COLY", "Jean-Bernard", "L6", "Dakar", "Oracle");
		enseignant2.ecrirePersonne();
		
		Enseignant enseignant3 = new Enseignant(3, "NDIAYE", "Ndéné", "Sacré-Coeur", "Saint-Louis", "Business Intelligence");
		enseignant3.ecrirePersonne();
		
		Etudiant etudiant1 = new Etudiant(1, "SOUGOU", "Hamza", "Bel-Air", "Dakar", "Licence 3");
		etudiant1.ecrirePersonne();
		
		Etudiant etudiant2 = new Etudiant(2, "MARS", "Bruno", "Maristes", "Dakar", "Master 2");
		etudiant2.ecrirePersonne();
		
		Personne.nbPersonne();
		
		System.out.println("Modifications ci-dessous");
		secretaire1.modifierPersonne("Blaise Diagne", "Podor");
		enseignant1.modifierPersonne("Plateau", "Louga");
		etudiant1.modifierPersonne("Malick Sy", "Kaolack");
		
		
	}

}
