package fr.esic.model;



public class Rdv {
	private String creneau;
	private String motif;
	private Employe patient;
	
public Rdv() {
}
public Rdv(String creneau, String motif, Employe patient) {
	this.creneau = creneau;
	this.motif = motif ;
	this.patient = patient;
}
public String getCreneau() {
	return creneau;
}
public void setCreneau(String creneau) {
	this.creneau = creneau;
}
public String getMotif() {
	return motif;
}
public void setMotif(String motif) {
	this.motif = motif;
}
public Employe getPatient() {
	return patient;
}
public void setPatient(Employe patient) {
	this.patient = patient;
}
public String infoRdv(String	 creneau, String motif, Employe patient) {
	return "Date et heure : "+creneau+"\nMotif : "+motif+"\nPatient : "+patient;
}
}
