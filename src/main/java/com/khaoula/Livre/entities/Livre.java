package com.khaoula.Livre.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Livre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idLivre;
private String nomLivre;
private Double prixLivre;
private Date datePublication;
@ManyToOne
private Editeur editeur;
public Livre() {
super();
}
public Livre(String nomLivre, Double prixLivre, Date datePublication) {
super();
this.nomLivre = nomLivre;
this.prixLivre = prixLivre;
this.datePublication = datePublication;
}
public Long getIdLivre() {
return idLivre;
}
public void setIdLivre(Long idLivre) {
this.idLivre = idLivre;
}
public String getNomLivre() {
return nomLivre;
}
public void setNomLivre(String nomLivre) {
this.nomLivre = nomLivre;
}
public Double getPrixLivre() {
return prixLivre;
}
public void setPrixLivre(Double prixLivre) {
this.prixLivre = prixLivre;
}
public Date getDatePublication() {
return datePublication;
}
public void setDatePublication(Date datePublication) {
this.datePublication = datePublication;
}

public Editeur getEditeur() {
return editeur;
}
public void setEditeur(Editeur editeur) {
this.editeur = editeur;
}
@Override
public String toString() {
return "Livre [idLivre=" + idLivre + ", nomLivre=" +
nomLivre + ", prixLivre=" + prixLivre
+ ", datePublication=" + datePublication + "]";
}

}