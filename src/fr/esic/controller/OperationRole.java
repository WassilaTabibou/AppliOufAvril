package fr.esic.controller;

import java.util.ArrayList;
import java.util.List;

import fr.esic.model.Role;

public class OperationRole {
public static List<Role>listRole = new ArrayList<Role>();

public static Role getRoleByRoleName(String nomRole) {
	Role role = null;
	for (Role r : listRole) {
		if(r.getNomRole().equals(nomRole)){
			role = r;
		}
	}return role;
}
}
