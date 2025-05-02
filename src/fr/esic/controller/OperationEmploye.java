package fr.esic.controller;

import java.util.ArrayList;
import java.util.List;

import fr.esic.library.MyLibrary;
import fr.esic.model.Employe;
import fr.esic.model.Role;


public class OperationEmploye {
public static List<Employe>listEmploye = new ArrayList<Employe>();

public static Employe connexion() {
	Employe employe = null;
	String email = MyLibrary.saisie("Saisissez votre email : ");
	String password = MyLibrary.saisie("Saisissez votre mot de passe");
	for (Employe e : listEmploye) {
		if(e.getMail().equals(email) && e.getMdp().equals(password)) {
			employe = e;
		}
	}return employe;
	
		

}

public static Employe createEmploye() {
	String nom = MyLibrary.saisie("Saisissez le nom de l'employé");
	String prenom = MyLibrary.saisie("Saisissez le prénom de l'employé");
	String email = MyLibrary.saisie("Saisissez l'email de l'employé");
	String mdp = MyLibrary.saisie("Saisissez votre mot de passe");
	
	Role role =OperationRole.getRoleByRoleName("employé".toUpperCase());
	
	
	Employe e = new Employe(nom, prenom, email, mdp, null);
	listEmploye.add(e);
	return e;
}

public static void deleteEmploye() {
	String nomE = MyLibrary.saisie("Saisissez le nom de l'employé à supprimer");
	Employe employe = null;
	for (Employe e : listEmploye) {
		if (e.getNom().equals(nomE)) {
			employe = e;
			listEmploye.remove(employe);
		}
		else { MyLibrary.afficher("Aucun employé à ce nom trouvé");
	}
	
		
		
	

}
}}