package fr.esic.controller;

import java.util.ArrayList;
import java.util.List;

import fr.esic.library.MyLibrary;
import fr.esic.model.Produit;

public class OperationProduit {
public static List<Produit>listProduit = new ArrayList<Produit>();

public static Produit createProduit() {
	String nom = MyLibrary.saisie("Veuillez saisir le nom du produit");
	Double prix = MyLibrary.saisieDouble("Veuillez saisir le prix du produit");
	int quantité = MyLibrary.saisieEntier("Veuillez saisir la quantité de produit");
	Produit produit = new Produit(nom, prix, quantité);
	OperationProduit.listProduit.add(produit);
	return produit;
}
public static Produit GetProduitByName() {
	String nomP = MyLibrary.saisie("Veuillez saisir le nom du produit recherché");
	Produit produit = null;
	for (Produit p : listProduit ) {
		if(p.getNom().equals(nomP)) {
			produit = p;
		}
	
}
	return produit;}

public static void deleteProduit() {
	Produit p = GetProduitByName();
	if (p!= null) {
		listProduit.remove(p);
		MyLibrary.afficher("Produit supprimé");
		}
	else {
		MyLibrary.afficher("Produit non trouvé");
	}
}

public static void showListProduit() {
	String data = "";
	for (Produit produit : listProduit) {
		data += produit.getNom()+"\n";
	}
	if (data.equals("")) {
		MyLibrary.afficher("Aucun produit trouvé");
	}
	else {
		MyLibrary.afficher(data);
	}
}
public static void ajouterAuPanier() {
	List<Produit>ListPanier = new ArrayList<Produit>();
	Produit nomP = GetProduitByName();
	Produit produit = null;
	for (Produit p : ListPanier) {
		if (p.getNom().equals(nomP)) {
			produit = p;
			ListPanier.add(produit);
			MyLibrary.afficher("Produit ajouté au panier");
		}
		else { 
			MyLibrary.afficher("Produit non trouvé");
		}
	}
}public static void achatProduit() {
	boolean continuer = true;
	while (continuer) {
	int choix = MyLibrary.saisieEntier("1-Voir les produits disponibles \n2-Ajouter au panier "
			+ "\n3-Voir le panier \n4-Payer\n5-Quitter");
		switch (choix) {
		case 1:
			OperationProduit.showListProduit();
			break;
		case 2 :
			OperationProduit.ajouterAuPanier();
			break;
		default:
			break;
		}
	}
}
}







