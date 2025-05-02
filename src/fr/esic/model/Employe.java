package fr.esic.model;

public class Employe {
	private String nom;
	private String prenom;
	private String mail;
	private String mdp;
	private Role role;

public Employe() {
	
}
 public Employe(String nom, String prenom, String mail, String mdp, Role role) {
	 this.nom = nom;
	 this.prenom = prenom;
	 this.mail = mail;
	 this.mdp = mdp;
	 this.role=role;
 }
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
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
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}

public String infoEmploye(String nom, String prenom, String mail, String mdp, Role role) {
	return "Nom : "+nom+"\nPrénom : "+prenom+"\nMail : "+mail+"\nMot de passe : "+mdp+"\nRôle : "+role.getNomRole();
}

}