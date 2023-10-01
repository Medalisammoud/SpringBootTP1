package tn.itbs.TP1.entites;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Utilisateur {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String nom;
	 	private String prenom;
	    private String username;
	    private String password;
	    private String email;
	    
	 	@OneToMany(mappedBy ="user", cascade=CascadeType.ALL, orphanRemoval=true)
	    private List<Projet> listProj = new ArrayList<Projet>();
}
