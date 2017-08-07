package com.net.Eboutique.Entities;

import java.io.Serializable;

public class Produit implements Serializable {
	
	private Long idProduit ;
	private String desingnation;
	private String description;
	private Double prix;
	private Boolean selected;
	private String photo;
	private Categorie categorie;
	private int quantite;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesingnation() {
		return desingnation;
	}
	public void setDesingnation(String desingnation) {
		this.desingnation = desingnation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit() {
		
	}
	public Produit(String desingnation, String description, Double prix, Boolean selected, String photo, int quantite) {
		super();
		this.desingnation = desingnation;
		this.description = description;
		this.prix = prix;
		this.selected = selected;
		this.photo = photo;
		this.quantite = quantite;
	}
	
	
	
	

	
	
}
