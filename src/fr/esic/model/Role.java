package fr.esic.model;

public class Role {
	private String nomRole ;
	private int id;
	
	public Role() {}
	
	public Role(String nomRole, int id) {
		this.nomRole= nomRole;
		this.id= id;
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String infoRole(String nomRole, int id) {
		return "Rôle : "+nomRole+"ID : "+id;
	}
}
