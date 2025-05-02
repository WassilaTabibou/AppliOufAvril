package fr.esic.controller;

import fr.esic.model.Carte;
import fr.esic.model.Employe;
import fr.esic.model.Produit;
import fr.esic.model.Rdv;
import fr.esic.model.Role;

public class Data {
public static void dataInit() {
	
	Role r1 = new Role("MEDECIN".toUpperCase(), 1);
	Role r2 = new Role("CLIENT".toUpperCase(),2);
	Role r3 = new Role("ADMIN".toUpperCase(),3);
	
	OperationRole.listRole.add(r1);
	OperationRole.listRole.add(r2);
	OperationRole.listRole.add(r3);
	
	Employe e1 = new Employe ("Tabibou","Wassila" , "wassila@gmail.com", "hbi", r3);
	Employe e2 = new Employe ("Ali Youssouf","Facri", "facri@gmail.com","hbi",r2);
	Employe e3 = new Employe ("l","t", "sa@yahoo.fr","hbi",r2);
	Employe e4 = new Employe ("k","r", "kr@gmail.com","hbi",r2);
	Employe e5 = new Employe ("y","u", "ta@gmail.com","hbi",r1);
	
	OperationEmploye.listEmploye.add(e1);
	OperationEmploye.listEmploye.add(e2);
	OperationEmploye.listEmploye.add(e3);
	OperationEmploye.listEmploye.add(e4);
	OperationEmploye.listEmploye.add(e5);
	
	
	Produit p1 = new Produit("Ananas", 2.06, 75);
	Produit p2 = new Produit("Miel",6.59, 14);
	Produit p3 = new Produit("Mangue", 1.99, 0);
	Produit p4 = new Produit("Crème anglaise", 1.45, 9);
	Produit p5 = new Produit("Fondant au chocolat", 7.19, 6);
	Produit p6 = new Produit("Mars glaçé", 3.38, 0);
	
	OperationProduit.listProduit.add(p1);
	OperationProduit.listProduit.add(p2);
	OperationProduit.listProduit.add(p3);
	OperationProduit.listProduit.add(p4);
	OperationProduit.listProduit.add(p5);
	OperationProduit.listProduit.add(p6);
	
	Carte c1 = new Carte(e1, 50.00, "C101");
	Carte c2 = new Carte(e2, 50.00, "C102");
	Carte c3 = new Carte(e3, 50.00, "C103");
	Carte c4 = new Carte(e4, 50.00, "C104");
	Carte c5 = new Carte(e5, 50.00, "C105");
	
	OperationCarte.listCarte.add(c1);
	OperationCarte.listCarte.add(c2);
	OperationCarte.listCarte.add(c3);
	OperationCarte.listCarte.add(c4);
	OperationCarte.listCarte.add(c5);
	
	Rdv rdv1 = new Rdv("23-04-2025 9:00", "Rhume", e1);
	Rdv rdv2 = new Rdv("23-04-2025 10:00", "Covid", e2);
	Rdv rdv3 = new Rdv("26-04-2025 15:00", "Gastro", e3);
	Rdv rdv4 = new Rdv("01-05-2025 11:00", "Entorse", e4);
	Rdv rdv5 = new Rdv("15-04-2025 16:45", "Prise de sang", e5);
	
	OperationRdv.ListRdv.add(rdv1);
	OperationRdv.ListRdv.add(rdv2);
	OperationRdv.ListRdv.add(rdv3);
	OperationRdv.ListRdv.add(rdv4);
	OperationRdv.ListRdv.add(rdv5);
}
}