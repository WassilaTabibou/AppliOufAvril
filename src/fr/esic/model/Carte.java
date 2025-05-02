package fr.esic.model;

public class Carte {
	private Employe titulaire;
	private double solde;
	private String numCarte;
	
public Carte(){}


public Carte(Employe titulaire, double solde, String numCarte) {
	this.titulaire = titulaire;
	this.solde = solde;
	this.numCarte = numCarte;
}


public Employe getTitulaire() {
	return titulaire;
}


public void setTitulaire(Employe titulaire) {
	this.titulaire = titulaire;
}


public double getSolde() {
	return solde;
}


public void setSolde(double solde) {
	this.solde = solde;
}


public String getNumCarte() {
	return numCarte;
}


public void setNumCarte(String numCarte) {
	this.numCarte = numCarte;
}

public String infoCarte(Employe titulaire, double solde, String numCarte) {
	return "Nom : "+titulaire +"\nSolde : "+solde+"\nNuméro de carte : "+numCarte;
}
public boolean depot(double montant) {
	if (montant >0) {
		solde += montant;
		return true ;
	}else {
		return false;
	}
}
public boolean retrait (double montant ) {
	if (montant >0) {
		solde -= montant;
		return true;
	}else {
		return false;
	}
}
public boolean virement(Carte carte, double montant) {
	if (retrait(montant)) {
		carte.depot(montant);
		return true;
	}else {
		return false;
	}
}
}