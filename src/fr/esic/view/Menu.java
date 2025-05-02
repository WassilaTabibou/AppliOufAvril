package fr.esic.view;

import fr.esic.controller.OperationCarte;
import fr.esic.controller.OperationEmploye;
import fr.esic.controller.OperationProduit;
import fr.esic.library.MyLibrary;
import fr.esic.model.Employe;

public class Menu {

public static void menuAdmin() {
	boolean continuer = true;
	while (continuer) {
	int choix = MyLibrary.saisieEntier("1-Ajouter un produit \n2-Supprimer un produit \n3-Voir la liste de produits"+
										"\n4-Ajouter un employé\n5-Supprimer un employé \n6-Quitter");
	switch (choix) {
	case 1:
		OperationProduit.createProduit();
		break;
	case 2:
		OperationProduit.deleteProduit();
		break;
	case 3:
		OperationProduit.showListProduit();
		break;
	case 4:
		OperationEmploye.createEmploye();
		break;
	case 5:
		OperationEmploye.deleteEmploye();
		break;
	case 6:
		continuer = false;
		break;
	default:
		MyLibrary.afficher("Une erreur s'est produite, réessayer");
		break;
	}}
}

public static void menuEmploye() {
	boolean continuer = true;
	while (continuer) {
	int choix = MyLibrary.saisieEntier("1-Consulter le solde \n2-Faire des achats dans le mini-centre commercial");
	switch (choix) {
	case 1 : 
		OperationCarte.consulterSolde();
		break;
	case 2 :
		OperationProduit.achatProduit();
		break;
	case 3 :
		break;
	default :
		MyLibrary.afficher("Une erreur s'est produite, veuillez rééssayer !");
		break;
		}}
	}

public static void demarrage() {
	Employe employe = OperationEmploye.connexion();
	switch (employe.getRole().getNomRole()) {
	case "ADMIN":
		menuAdmin();
		break;
	case "CLIENT":
		menuEmploye();
		break;
	case "MEDECIN":
		break;
	default:
		break;
	}
}
}
