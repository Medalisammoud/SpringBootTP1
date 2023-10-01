package tn.itbs.TP1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.itbs.TP1.entites.Utilisateur;


public interface UtilisateurRepo extends JpaRepository <Utilisateur, Integer> {

}
