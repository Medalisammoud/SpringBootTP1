package tn.itbs.TP1.entites;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Projet {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 	private String nom_projet, description;
 	private Date date_debut, date_fin;
 	
 	@ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "userId")
    private Utilisateur utilisateur;
 	
}
