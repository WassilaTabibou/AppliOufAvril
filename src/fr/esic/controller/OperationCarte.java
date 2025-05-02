package fr.esic.controller;

import java.util.ArrayList;
import java.util.List;

import fr.esic.library.MyLibrary;
import fr.esic.model.Carte;

public class OperationCarte {
public static List<Carte>listCarte = new ArrayList<Carte>();

public static Carte getCarteByNum() {
	Carte carte = null;
	String numeroCarte = MyLibrary.saisie("Saisissez le numéro de votre carte : ");
	for (Carte c : listCarte) {
		if (c.getNumCarte().equals(numeroCarte)) {
			carte = c;
	}
	}return carte;
	
}
public static void consulterSolde() {
	Carte c = getCarteByNum();
	if (c != null) {
		MyLibrary.afficher("Le solde est de "+c.getSolde());
	}
}
public static void virement() {
	Carte c = getCarteByNum();
	if (c != null) {
		double montant = MyLibrary.saisieDouble("Saisissez le montant à virer");
		c.depot(solde);
	}else {
		MyLibrary.afficher("Compte introuvable");
	}
	
	
}
}
