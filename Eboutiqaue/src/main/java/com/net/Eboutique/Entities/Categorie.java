package com.net.Eboutique.Entities;

import java.io.Serializable;
import java.util.Collection;

public class Categorie implements Serializable {
	
	private Long idCat;
	private String nomCat;
	private String description ;
	private Byte[] photo;
	private String nomPhoto;
	private Collection<Produit> produits;
	public Long getIdCat() {
		return idCat;
	}
	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}
	public String getNomPhoto() {
		return nomPhoto;
	}
	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	public Categorie() {
		
	}
	public Categorie(String nomCat, String description, Byte[] photo, String nomPhoto) {
		super();
		this.nomCat = nomCat;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
	}
	
	
	
	

}
