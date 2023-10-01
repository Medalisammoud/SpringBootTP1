package tn.itbs.TP1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.TP1.entites.Utilisateur;
import tn.itbs.TP1.service.UtilisateurService;

@RestController
public class UtilisateurController {
	 @Autowired
	    private UtilisateurService userService;
	 
	 @PostMapping("/add")
	 public void ajout (@RequestBody Utilisateur user) {
		 userService.creation(user);
	 }
}
