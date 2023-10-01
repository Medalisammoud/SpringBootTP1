package tn.itbs.TP1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.itbs.TP1.entites.Utilisateur;
import tn.itbs.TP1.repository.UtilisateurRepo;

@Service
public class UtilisateurService {
	@Autowired
	private UtilisateurRepo userRepo;
	
	public void creation (Utilisateur user) {
		userRepo.save(user);
	}
}
